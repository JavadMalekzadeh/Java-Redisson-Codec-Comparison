package com.tosan.redissoncodectest;

import com.esotericsoftware.kryo.Kryo;

import com.google.protobuf.GeneratedMessageV3;
import com.tosan.redissoncodectest.entities.SampleObjectForTest;
import com.tosan.redissoncodectest.externalCodec.ProtobufCodec2;
import com.tosan.redissoncodectest.protoEntities.ProtoObject;
import com.tosan.redissoncodectest.protoEntities.SampleProtoObjectForTest;
import org.junit.jupiter.api.Test;
import org.redisson.Redisson;
import org.redisson.api.LocalCachedMapOptions;
import org.redisson.api.RLocalCachedMap;
import org.redisson.api.RedissonClient;
import org.redisson.client.codec.Codec;
import org.redisson.codec.*;
import org.redisson.config.Config;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class RedissonCodecTestApplicationTests extends InitializeRedisTest{

    private Codec smileCodec=new SmileJacksonCodec();
    private Codec serializationCodec=new SerializationCodec();
    private Codec kryoCodec=new KryoCodec();
    private Codec jsonCodec=new JsonJacksonCodec();
    private Codec cborCodec=new CborJacksonCodec();
    private Codec fstCodec=new FstCodec();
    private Codec snappyCodec=new SnappyCodec();
    private Codec snappyCodecV2=new SnappyCodecV2();
    private Codec lz4Codec=new LZ4Codec();
    private Codec marshallingCodec=new MarshallingCodec();
    private Codec protobufCodec=new ProtobufCodec2();


//    @Test
//    public void avroJacksonTest() throws JsonMappingException {
//        AvroMapper avroMapper=new AvroMapper();
//        AvroSchema avroSchema=avroMapper.schemaFor(SampleObjectForTest.class);
//        Codec avroJacksonCodec=new AvroJacksonCodec(SampleObjectForTest.class, avroSchema);
//        Config config=createConfig();
//        config.setCodec(avroJacksonCodec);
//        RedissonClient redisson= Redisson.create(config);
//        redisCashingTest(redisson,"AvroJacksonCodecTest");
//    }
    @Test
    public void smileCodecTest(){
        Config config=createConfig();
        config.setCodec(smileCodec);
        RedissonClient redisson= Redisson.create(config);
        redisCashingTest(redisson,"SmileCodecTest");
    }


    @Test
    public void LZ4CodecTest(){
        Config config=createConfig();
        config.setCodec(lz4Codec);
        RedissonClient redisson= Redisson.create(config);
        redisCashingTest(redisson,"LZ4CodecTest");
    }

//    @Test
//    public void kryoCodecTest(){
//        Config config=createConfig();
//        config.setCodec(kryoCodec);
//        RedissonClient redisson= Redisson.create(config);
//        Kryo kryo=new Kryo();
//        kryo.register(ArrayList.class);
//        //redisCashingTestForKyro(redisson,"KryoCodecTest");
//    }

    @Test
    public void jsonCodecTest(){
        Config config=createConfig();
        config.setCodec(jsonCodec);
        RedissonClient redisson= Redisson.create(config);
        redisCashingTest(redisson,"JsonCodecTest");
    }

    @Test
    public void cborCodecTest(){
        Config config=createConfig();
        config.setCodec(cborCodec);
        RedissonClient redisson= Redisson.create(config);
        redisCashingTest(redisson,"CborCodecTest");
    }

    @Test
    public void snappyCodecTest(){
        Config config=createConfig();
        config.setCodec(snappyCodec);
        RedissonClient redisson= Redisson.create(config);
        redisCashingTest(redisson,"SnappyCodecTest");
    }


    @Test
    public void snappyCodecV2Test(){
        Config config=createConfig();
        config.setCodec(snappyCodecV2);
        RedissonClient redisson= Redisson.create(config);
        redisCashingTest(redisson,"snappyCodecV2Test");
    }
    @Test
    public void fstCodecTest(){
        Config config=createConfig();
        config.setCodec(fstCodec);
        RedissonClient redisson= Redisson.create(config);
        redisCashingTest(redisson,"fstCodecTest");
    }

    @Test
    public void serializationCodecTest(){
        Config config=createConfig();
        config.setCodec(serializationCodec);
        RedissonClient redisson= Redisson.create(config);
        redisCashingTest(redisson,"serializationCodecTest");
    }

    @Test
    public void marshallingCodecTest(){
        Config config=createConfig();
        config.setCodec(marshallingCodec);
        RedissonClient redisson= Redisson.create(config);
        redisCashingTest(redisson,"MarshallingCodecTest");
    }

    @Test
    public void protobufCodecTest(){
        Config config=createConfig();
        config.setCodec(protobufCodec);
        RedissonClient redisson= Redisson.create(config);
        redisCashingTestForProtobuf(redisson,"ProtobufCodecTest");
    }

    private void redisCashingTestForProtobuf(RedissonClient redisson, String key) {
        RLocalCachedMap<String, GeneratedMessageV3> localCache= redisson
                .getLocalCachedMap(key, LocalCachedMapOptions.defaults());

        SampleProtoObjectForTest.Builder sampleProto=SampleProtoObjectForTest.newBuilder();

        List<ProtoObject.Builder> listProtoObject=
                Arrays.asList(ProtoObject.newBuilder().setIntValue(1),
                        ProtoObject.newBuilder().setIntValue(2),
                        ProtoObject.newBuilder().setDoubleValue(2.5),
                        ProtoObject.newBuilder().setStringValue("something to change"));

        sampleProto.setDoubleTypeField(new Double(100000.0))
                .setFloatTypeField(100.0f)
                .setIntTypeField(100)
                .setLongTypeField(10000000000L)
                .setBoolFalseField(false)
                .setBoolTrueField(true)
                .setStringTypeField("this is an example for String type test.")
                .addListObjectTypeField(ProtoObject.newBuilder().setIntValue(1))
                .addListObjectTypeField(ProtoObject.newBuilder().setIntValue(2))
                .addListObjectTypeField(ProtoObject.newBuilder().setFloatValue(2.5f))
                .addListObjectTypeField(ProtoObject.newBuilder().setStringValue("something to change"));
        long allDurations=0;
        for(int index=0;index<1000;index++) {
            long startTime = System.currentTimeMillis();
            localCache.put("SampleObjectForTest", sampleProto.build());
            SampleProtoObjectForTest getSampleProtoObjectForTest =
                    (SampleProtoObjectForTest) localCache.get("SampleObjectForTest");
            long endTime = System.currentTimeMillis();
            allDurations+=(endTime-startTime);
        }
        System.out.println("=============== "+key+" ===================");
        System.out.println("Duration Time: "+(allDurations/1000.0));
        redisson.shutdown();

    }

    private void redisCashingTest(RedissonClient redisson,String key) {
        RLocalCachedMap<String, Object> localCache= redisson
                .getLocalCachedMap(key, LocalCachedMapOptions.defaults());

        SampleObjectForTest sampleObjectForTest=
                new SampleObjectForTest();
        sampleObjectForTest.setDoubleTypeField(new Double(100000.0));
        sampleObjectForTest.setFloatTypeField(100.0f);
        sampleObjectForTest.setIntTypeField(100);
        sampleObjectForTest.setLongTypeField(10000000000L);
        sampleObjectForTest.setBoolFalseField(false);
        sampleObjectForTest.setBoolTrueField(true);
        sampleObjectForTest.setStringTypeField("this is an example for String type test.");
        sampleObjectForTest
                .setArrayListOfObjectTypeField(new ArrayList<Object>(Arrays.asList(1,2,2.5,"something to change")));
        long allDurations=0;
        for(int index=0;index<1000;index++) {
            long startTime = System.currentTimeMillis();
            localCache.put("SampleObjectForTest", sampleObjectForTest);
            SampleObjectForTest getSampleObjectForTest = (SampleObjectForTest) localCache.get("SampleObjectForTest");
            long endTime = System.currentTimeMillis();
            allDurations+=(endTime-startTime);
        }
        System.out.println("=============== "+key+" ===================");
        System.out.println("Duration Time: "+(allDurations/1000.0));
        redisson.shutdown();

    }

//    private void redisCashingTestForKyro(RedissonClient redisson, String key) {
//        RLocalCachedMap<String, Object> localCache= redisson
//                .getLocalCachedMap(key, LocalCachedMapOptions.defaults());
//
//        localCache.put("double",new Double(100000.0));
//        localCache.put("float",100.0f);
//        localCache.put("int",100);
//        localCache.put("long",10000000000L);
//        localCache.put("boolF",false);
//        localCache.put("boolT",true);
//        localCache.put("string","this is an example for String type test.");
//       // localCache.put("array",new ArrayList<Object>(Arrays.asList(1,2,2.5,"something to change")));
//
//        redisson.shutdown();
//
//    }



}
