package org.ekstep.ep.samza.fixtures;

public class TelemetryV3 {
    /**
     * Valid event with all proper data type
     */
    public static final String VALID_EVENT = "{\"actor\":{\"type\":\"User\",\"id\":\"4c4530df-0d4f-42a5-bd91-0366716c8c24\"},\"edata\":{\"id\":\"content-detail\",\"type\":\"OTHER\",\"pageid\":\"content-detail\",\"subtype\":\"detail\",\"extra\":{\"values\":[{\"isDownloaded\":true,\"isUpdateAvailable\":false}]}},\"eid\":\"INTERACT\",\"ver\":\"3.0\",\"ets\":1551344686294,\"context\":{\"pdata\":{\"ver\":\"2.0.localstaging-debug\",\"pid\":\"sunbird.app\",\"id\":\"staging.diksha.app\"},\"channel\":\"01231711180382208027\",\"env\":\"home\",\"did\":\"6c61348dc9841f27c96f4887b64ee1f777d74c38\",\"sid\":\"cef2d0be-83fc-4988-8ad9-1b72399e6d3a\",\"cdata\":[]},\"mid\":\"3318a611-50fa-4ae9-9167-7b4390a62b9f\",\"object\":{\"id\":\"do_21228031946955980819\",\"type\":\"Worksheet\",\"version\":\"1.0\",\"rollup\":{\"l4\":\"do_21270636501657190413450\",\"l1\":\"do_21270636097196032013440\",\"l2\":\"do_21270636501655552013444\",\"l3\":\"do_21270636501657190413448\"}},\"tags\":[],\"syncts\":1551344699388,\"@timestamp\":\"2019-02-28T09:04:59.388Z\",\"flags\":{\"tv_processed\":true,\"dd_processed\":true,\"device_location_retrieved\":true,\"user_location_retrieved\":false,\"content_data_retrieved\":true,\"user_data_retrieved\":true,\"device_data_retrieved\":true},\"type\":\"events\",\"ts\":\"2019-02-28T09:04:46.294+0000\",\"devicedata\":{\"statecustomcode\":\"\",\"country\":\"\",\"city\":\"\",\"countrycode\":\"\",\"state\":\"\",\"statecode\":\"\",\"districtcustom\":\"\",\"statecustomname\":\"\",\"uaspec\":{},\"firstaccess\":1545920698694},\"userdata\":{\"district\":\"\",\"state\":\"\",\"subject\":[\"English\"],\"grade\":[\"KG\",\"Class 1\",\"Class 2\",\"Class 3\",\"Class 4\",\"Class 5\",\"Class 6\",\"Class 7\",\"Class 8\",\"Class 9\",\"Class 10\",\"Class 11\",\"Class 12\",\"Other\"],\"language\":[\"English\",\"Gujarati\",\"Hindi\"]},\"contentdata\":{\"pkgversion\":1,\"language\":[\"Assamese\"],\"lastpublishedon\":1499851249497,\"contenttype\":\"Resource\",\"lastupdatedon\":1499851152176,\"framework\":\"NCF\",\"name\":\"Test review process\",\"mimetype\":\"application/vnd.ekstep.ecml-archive\",\"objecttype\":\"Content\",\"mediatype\":\"content\",\"status\":\"Live\"}}";
    /**
     * Passing Invalid event having wrong `pkgVersion` type
     */
    public static final String INVALID_EVENT = "{\"actor\":{\"type\":\"User\",\"id\":\"4c4530df-0d4f-42a5-bd91-0366716c8c24\"},\"edata\":{\"id\":\"content-detail\",\"type\":\"OTHER\",\"pageid\":\"content-detail\",\"subtype\":\"detail\",\"extra\":{\"values\":[{\"isDownloaded\":true,\"isUpdateAvailable\":false}]}},\"eid\":\"INTERACT\",\"ver\":\"3.0\",\"ets\":1551344686294,\"context\":{\"pdata\":{\"ver\":\"2.0.localstaging-debug\",\"pid\":\"sunbird.app\",\"id\":\"staging.diksha.app\"},\"channel\":\"01231711180382208027\",\"env\":\"home\",\"did\":\"6c61348dc9841f27c96f4887b64ee1f777d74c38\",\"sid\":\"cef2d0be-83fc-4988-8ad9-1b72399e6d3a\",\"cdata\":[]},\"mid\":\"3318a611-50fa-4ae9-9167-7b4390a62b9f\",\"object\":{\"id\":\"do_21228031946955980819\",\"type\":\"Worksheet\",\"version\":\"1.0\",\"rollup\":{\"l4\":\"do_21270636501657190413450\",\"l1\":\"do_21270636097196032013440\",\"l2\":\"do_21270636501655552013444\",\"l3\":\"do_21270636501657190413448\"}},\"tags\":[],\"syncts\":1551344699388,\"@timestamp\":\"2019-02-28T09:04:59.388Z\",\"flags\":{\"tv_processed\":true,\"dd_processed\":true,\"device_location_retrieved\":true,\"user_location_retrieved\":false,\"content_data_retrieved\":true,\"user_data_retrieved\":true,\"device_data_retrieved\":true},\"type\":\"events\",\"ts\":\"2019-02-28T09:04:46.294+0000\",\"devicedata\":{\"statecustomcode\":\"\",\"country\":\"\",\"city\":\"\",\"countrycode\":\"\",\"state\":\"\",\"statecode\":\"\",\"districtcustom\":\"\",\"statecustomname\":\"\",\"uaspec\":{},\"firstaccess\":1545920698694},\"userdata\":{\"district\":\"\",\"state\":\"\",\"subject\":[\"English\"],\"grade\":[\"KG\",\"Class 1\",\"Class 2\",\"Class 3\",\"Class 4\",\"Class 5\",\"Class 6\",\"Class 7\",\"Class 8\",\"Class 9\",\"Class 10\",\"Class 11\",\"Class 12\",\"Other\"],\"language\":[\"English\",\"Gujarati\",\"Hindi\"]},\"contentdata\":{\"pkgversion\":\"1\",\"language\":[\"Assamese\"],\"lastpublishedon\":1499851249497,\"contenttype\":\"Resource\",\"lastupdatedon\":1499851152176,\"framework\":\"NCF\",\"name\":\"Test review process\",\"mimetype\":\"application/vnd.ekstep.ecml-archive\",\"objecttype\":\"Content\",\"mediatype\":\"content\",\"status\":\"Live\"}}";

    /**
     * Passing Invalid event having wrong `gradelist` data type
     */
    public static final String INVALID_USERDATA = "{\"eid\":\"SEARCH\",\"ets\":1551332806642,\"ver\":\"3.0\",\"mid\":\"LP.1551332806642.922fb715-b4ed-421c-bae4-5ec48fd4d255\",\"actor\":{\"id\":\"org.ekstep.learning.platform\",\"type\":\"System\"},\"context\":{\"channel\":\"in.ekstep\",\"pdata\":{\"id\":\"staging.ntp.learning.platform\",\"pid\":\"search-service\",\"ver\":\"1.0\"},\"env\":\"search\"},\"edata\":{\"size\":259168,\"query\":\"\",\"filters\":{},\"sort\":{},\"type\":\"all\",\"topn\":[{\"identifier\":\"mh_fm_1_topic_science_usefulandharmfulmicrobes_harmfulmicroorganismsclostridiumandothers\"},{\"identifier\":\"mh_fm_1_topic_science_classificationofplants_subkingdomangiosperms\"},{\"identifier\":\"do_21254796078943436811896\"},{\"identifier\":\"do_21253024920136089612518\"},{\"identifier\":\"do_2125457233644748801997\"}]},\"flags\":{\"tv_processed\":true,\"dd_processed\":true,\"device_location_retrieved\":false},\"type\":\"events\",\"syncts\":1551341370427,\"@timestamp\":\"2019-02-28T08:09:30.427Z\",\"ts\":\"2019-02-28T05:46:46.642+0000\",\"devicedata\":{\"statecustomcode\":\"\",\"country\":\"\",\"city\":\"\",\"countrycode\":\"\",\"state\":\"\",\"statecode\":\"\",\"districtcustom\":\"\",\"statecustomname\":\"\"},\"dialcodedata\":{\"channel\":\"\",\"batchcode\":\"\",\"publisher\":\"\",\"generatedon\":43568797685,\"publishedon\":508978490534,\"status\":\"\",\"objecttype\":\"\"},\"userdata\":{\"gradelist\":{},\"languagelist\":[],\"subjectlist\":[],\"usertype\":\"\",\"state\":\"\",\"district\":\"\"}}";

    /**
     * Passing Invalid Device data having wrong `firstAccess` data type
     */
    public static final String INVALID_DEVICEDATA_CASE_1 = "{\"actor\":{\"type\":\"User\",\"id\":\"4c4530df-0d4f-42a5-bd91-0366716c8c24\"},\"edata\":{\"id\":\"content-detail\",\"type\":\"OTHER\",\"pageid\":\"content-detail\",\"subtype\":\"detail\",\"extra\":{\"values\":[{\"isDownloaded\":true,\"isUpdateAvailable\":false}]}},\"eid\":\"INTERACT\",\"ver\":\"3.0\",\"ets\":1551344686294,\"context\":{\"pdata\":{\"ver\":\"2.0.localstaging-debug\",\"pid\":\"sunbird.app\",\"id\":\"staging.diksha.app\"},\"channel\":\"01231711180382208027\",\"env\":\"home\",\"did\":\"6c61348dc9841f27c96f4887b64ee1f777d74c38\",\"sid\":\"cef2d0be-83fc-4988-8ad9-1b72399e6d3a\",\"cdata\":[]},\"mid\":\"3318a611-50fa-4ae9-9167-7b4390a62b9f\",\"object\":{\"id\":\"do_21228031946955980819\",\"type\":\"Worksheet\",\"version\":\"1.0\",\"rollup\":{\"l4\":\"do_21270636501657190413450\",\"l1\":\"do_21270636097196032013440\",\"l2\":\"do_21270636501655552013444\",\"l3\":\"do_21270636501657190413448\"}},\"tags\":[],\"syncts\":1551344699388,\"@timestamp\":\"2019-02-28T09:04:59.388Z\",\"flags\":{\"tv_processed\":true,\"dd_processed\":true,\"device_location_retrieved\":true,\"user_location_retrieved\":false,\"content_data_retrieved\":true,\"user_data_retrieved\":true,\"device_data_retrieved\":true},\"type\":\"events\",\"ts\":\"2019-02-28T09:04:46.294+0000\",\"devicedata\":{\"statecustomcode\":\"KA\",\"country\":\"India\",\"city\":\"Banglore\",\"countrycode\":\"IND\",\"state\":\"Karnataka\",\"statecode\":\"\",\"districtcustom\":\"\",\"statecustomname\":\"\",\"uaspec\":{},\"firstaccess\":\"1545920698694\"},\"userdata\":{\"district\":\"\",\"state\":\"\",\"subject\":[\"English\"],\"grade\":[\"KG\",\"Class 1\",\"Class 2\",\"Class 3\",\"Class 4\",\"Class 5\",\"Class 6\",\"Class 7\",\"Class 8\",\"Class 9\",\"Class 10\",\"Class 11\",\"Class 12\",\"Other\"],\"language\":[\"English\",\"Gujarati\",\"Hindi\"]},\"contentdata\":{\"pkgversion\":1,\"language\":[\"Assamese\"],\"lastpublishedon\":1499851249497,\"contenttype\":\"Resource\",\"lastupdatedon\":1499851152176,\"framework\":\"NCF\",\"name\":\"Test review process\",\"mimetype\":\"application/vnd.ekstep.ecml-archive\",\"objecttype\":\"Content\",\"mediatype\":\"content\",\"status\":\"Live\"}}";

    /**
     * Passing Invalid Device data having wrong `uaspec` data type
     */
    public static final String INVALID_DEVICEDATA_CASE_2 = "{\"actor\":{\"type\":\"User\",\"id\":\"4c4530df-0d4f-42a5-bd91-0366716c8c24\"},\"edata\":{\"id\":\"content-detail\",\"type\":\"OTHER\",\"pageid\":\"content-detail\",\"subtype\":\"detail\",\"extra\":{\"values\":[{\"isDownloaded\":true,\"isUpdateAvailable\":false}]}},\"eid\":\"INTERACT\",\"ver\":\"3.0\",\"ets\":1551344686294,\"context\":{\"pdata\":{\"ver\":\"2.0.localstaging-debug\",\"pid\":\"sunbird.app\",\"id\":\"staging.diksha.app\"},\"channel\":\"01231711180382208027\",\"env\":\"home\",\"did\":\"6c61348dc9841f27c96f4887b64ee1f777d74c38\",\"sid\":\"cef2d0be-83fc-4988-8ad9-1b72399e6d3a\",\"cdata\":[]},\"mid\":\"3318a611-50fa-4ae9-9167-7b4390a62b9f\",\"object\":{\"id\":\"do_21228031946955980819\",\"type\":\"Worksheet\",\"version\":\"1.0\",\"rollup\":{\"l4\":\"do_21270636501657190413450\",\"l1\":\"do_21270636097196032013440\",\"l2\":\"do_21270636501655552013444\",\"l3\":\"do_21270636501657190413448\"}},\"tags\":[],\"syncts\":1551344699388,\"@timestamp\":\"2019-02-28T09:04:59.388Z\",\"flags\":{\"tv_processed\":true,\"dd_processed\":true,\"device_location_retrieved\":true,\"user_location_retrieved\":false,\"content_data_retrieved\":true,\"user_data_retrieved\":true,\"device_data_retrieved\":true},\"type\":\"events\",\"ts\":\"2019-02-28T09:04:46.294+0000\",\"devicedata\":{\"statecustomcode\":\"KA\",\"country\":\"India\",\"city\":\"Banglore\",\"countrycode\":\"IND\",\"state\":\"Karnataka\",\"statecode\":\"\",\"districtcustom\":\"\",\"statecustomname\":\"\",\"uaspec\":[],\"firstaccess\":1545920698694},\"userdata\":{\"district\":\"\",\"state\":\"\",\"subject\":[\"English\"],\"grade\":[\"KG\",\"Class 1\",\"Class 2\",\"Class 3\",\"Class 4\",\"Class 5\",\"Class 6\",\"Class 7\",\"Class 8\",\"Class 9\",\"Class 10\",\"Class 11\",\"Class 12\",\"Other\"],\"language\":[\"English\",\"Gujarati\",\"Hindi\"]},\"contentdata\":{\"pkgversion\":1,\"language\":[\"Assamese\"],\"lastpublishedon\":1499851249497,\"contenttype\":\"Resource\",\"lastupdatedon\":1499851152176,\"framework\":\"NCF\",\"name\":\"Test review process\",\"mimetype\":\"application/vnd.ekstep.ecml-archive\",\"objecttype\":\"Content\",\"mediatype\":\"content\",\"status\":\"Live\"}}";

    /**
     * Passing Invalid Device data having wrong `country` data type and missing few fields
     */
    public static final String INVALID_DEVICEDATA_CASE_3 = "{\"actor\":{\"type\":\"User\",\"id\":\"4c4530df-0d4f-42a5-bd91-0366716c8c24\"},\"edata\":{\"id\":\"content-detail\",\"type\":\"OTHER\",\"pageid\":\"content-detail\",\"subtype\":\"detail\",\"extra\":{\"values\":[{\"isDownloaded\":true,\"isUpdateAvailable\":false}]}},\"eid\":\"INTERACT\",\"ver\":\"3.0\",\"ets\":1551344686294,\"context\":{\"pdata\":{\"ver\":\"2.0.localstaging-debug\",\"pid\":\"sunbird.app\",\"id\":\"staging.diksha.app\"},\"channel\":\"01231711180382208027\",\"env\":\"home\",\"did\":\"6c61348dc9841f27c96f4887b64ee1f777d74c38\",\"sid\":\"cef2d0be-83fc-4988-8ad9-1b72399e6d3a\",\"cdata\":[]},\"mid\":\"3318a611-50fa-4ae9-9167-7b4390a62b9f\",\"object\":{\"id\":\"do_21228031946955980819\",\"type\":\"Worksheet\",\"version\":\"1.0\",\"rollup\":{\"l4\":\"do_21270636501657190413450\",\"l1\":\"do_21270636097196032013440\",\"l2\":\"do_21270636501655552013444\",\"l3\":\"do_21270636501657190413448\"}},\"tags\":[],\"syncts\":1551344699388,\"@timestamp\":\"2019-02-28T09:04:59.388Z\",\"flags\":{\"tv_processed\":true,\"dd_processed\":true,\"device_location_retrieved\":true,\"user_location_retrieved\":false,\"content_data_retrieved\":true,\"user_data_retrieved\":true,\"device_data_retrieved\":true},\"type\":\"events\",\"ts\":\"2019-02-28T09:04:46.294+0000\",\"devicedata\":{\"statecustomcode\":\"KA\",\"country\":958743,\"city\":\"Banglore\",\"countrycode\":\"IND\",\"statecode\":\"\",\"districtcustom\":\"\",\"uaspec\":[],\"firstaccess\":1545920698694},\"userdata\":{\"district\":\"\",\"state\":\"\",\"subject\":[\"English\"],\"grade\":[\"KG\",\"Class 1\",\"Class 2\",\"Class 3\",\"Class 4\",\"Class 5\",\"Class 6\",\"Class 7\",\"Class 8\",\"Class 9\",\"Class 10\",\"Class 11\",\"Class 12\",\"Other\"],\"language\":[\"English\",\"Gujarati\",\"Hindi\"]},\"contentdata\":{\"pkgversion\":1,\"language\":[\"Assamese\"],\"lastpublishedon\":1499851249497,\"contenttype\":\"Resource\",\"lastupdatedon\":1499851152176,\"framework\":\"NCF\",\"name\":\"Test review process\",\"mimetype\":\"application/vnd.ekstep.ecml-archive\",\"objecttype\":\"Content\",\"mediatype\":\"content\",\"status\":\"Live\"}}";

    /**
     * Passing Invalid Device data having wrong `firstAccess` data type to float format
     */
    public static final String INVALID_DEVICEDATA_CASE_4 = "{\"actor\":{\"type\":\"User\",\"id\":\"4c4530df-0d4f-42a5-bd91-0366716c8c24\"},\"edata\":{\"id\":\"content-detail\",\"type\":\"OTHER\",\"pageid\":\"content-detail\",\"subtype\":\"detail\",\"extra\":{\"values\":[{\"isDownloaded\":true,\"isUpdateAvailable\":false}]}},\"eid\":\"INTERACT\",\"ver\":\"3.0\",\"ets\":1551344686294,\"context\":{\"pdata\":{\"ver\":\"2.0.localstaging-debug\",\"pid\":\"sunbird.app\",\"id\":\"staging.diksha.app\"},\"channel\":\"01231711180382208027\",\"env\":\"home\",\"did\":\"6c61348dc9841f27c96f4887b64ee1f777d74c38\",\"sid\":\"cef2d0be-83fc-4988-8ad9-1b72399e6d3a\",\"cdata\":[]},\"mid\":\"3318a611-50fa-4ae9-9167-7b4390a62b9f\",\"object\":{\"id\":\"do_21228031946955980819\",\"type\":\"Worksheet\",\"version\":\"1.0\",\"rollup\":{\"l4\":\"do_21270636501657190413450\",\"l1\":\"do_21270636097196032013440\",\"l2\":\"do_21270636501655552013444\",\"l3\":\"do_21270636501657190413448\"}},\"tags\":[],\"syncts\":1551344699388,\"@timestamp\":\"2019-02-28T09:04:59.388Z\",\"flags\":{\"tv_processed\":true,\"dd_processed\":true,\"device_location_retrieved\":true,\"user_location_retrieved\":false,\"content_data_retrieved\":true,\"user_data_retrieved\":true,\"device_data_retrieved\":true},\"type\":\"events\",\"ts\":\"2019-02-28T09:04:46.294+0000\",\"devicedata\":{\"statecustomcode\":\"\",\"country\":\"\",\"city\":\"\",\"countrycode\":\"\",\"state\":\"\",\"statecode\":\"\",\"districtcustom\":\"\",\"statecustomname\":\"\",\"uaspec\":{},\"firstaccess\":12},\"userdata\":{\"district\":\"\",\"state\":\"\",\"subject\":[\"English\"],\"grade\":[\"KG\",\"Class 1\",\"Class 2\",\"Class 3\",\"Class 4\",\"Class 5\",\"Class 6\",\"Class 7\",\"Class 8\",\"Class 9\",\"Class 10\",\"Class 11\",\"Class 12\",\"Other\"],\"language\":[\"English\",\"Gujarati\",\"Hindi\"]},\"contentdata\":{\"pkgversion\":1,\"language\":[\"Assamese\"],\"lastpublishedon\":1499851249497,\"contenttype\":\"Resource\",\"lastupdatedon\":1499851152176,\"framework\":\"NCF\",\"name\":\"Test review process\",\"mimetype\":\"application/vnd.ekstep.ecml-archive\",\"objecttype\":\"Content\",\"mediatype\":\"content\",\"status\":\"Live\"}}";


    /**
     * Passing Invalid Event Having wrong data type format in Languages field
     */
    public static final String INVALID_CONTENTDATA = "{\"actor\":{\"type\":\"User\",\"id\":\"4c4530df-0d4f-42a5-bd91-0366716c8c24\"},\"edata\":{\"id\":\"content-detail\",\"type\":\"OTHER\",\"pageid\":\"content-detail\",\"subtype\":\"detail\",\"extra\":{\"values\":[{\"isDownloaded\":true,\"isUpdateAvailable\":false}]}},\"eid\":\"INTERACT\",\"ver\":\"3.0\",\"ets\":1551344686294,\"context\":{\"pdata\":{\"ver\":\"2.0.localstaging-debug\",\"pid\":\"sunbird.app\",\"id\":\"staging.diksha.app\"},\"channel\":\"01231711180382208027\",\"env\":\"home\",\"did\":\"6c61348dc9841f27c96f4887b64ee1f777d74c38\",\"sid\":\"cef2d0be-83fc-4988-8ad9-1b72399e6d3a\",\"cdata\":[]},\"mid\":\"3318a611-50fa-4ae9-9167-7b4390a62b9f\",\"object\":{\"id\":\"do_21228031946955980819\",\"type\":\"Worksheet\",\"version\":\"1.0\",\"rollup\":{\"l4\":\"do_21270636501657190413450\",\"l1\":\"do_21270636097196032013440\",\"l2\":\"do_21270636501655552013444\",\"l3\":\"do_21270636501657190413448\"}},\"tags\":[],\"syncts\":1551344699388,\"@timestamp\":\"2019-02-28T09:04:59.388Z\",\"flags\":{\"tv_processed\":true,\"dd_processed\":true,\"device_location_retrieved\":true,\"user_location_retrieved\":false,\"content_data_retrieved\":true,\"user_data_retrieved\":true,\"device_data_retrieved\":true},\"type\":\"events\",\"ts\":\"2019-02-28T09:04:46.294+0000\",\"devicedata\":{\"statecustomcode\":\"\",\"country\":\"\",\"city\":\"\",\"countrycode\":\"\",\"state\":\"\",\"statecode\":\"\",\"districtcustom\":\"\",\"statecustomname\":\"\",\"uaspec\":{},\"firstaccess\":125465324536475},\"userdata\":{\"district\":\"\",\"state\":\"\",\"subject\":[\"English\"],\"grade\":[\"KG\",\"Class 1\",\"Class 2\",\"Class 3\",\"Class 4\",\"Class 5\",\"Class 6\",\"Class 7\",\"Class 8\",\"Class 9\",\"Class 10\",\"Class 11\",\"Class 12\",\"Other\"],\"language\":[\"English\",\"Gujarati\",\"Hindi\"]},\"contentdata\":{\"pkgversion\":1,\"language\":{},\"lastpublishedon\":1499851249497,\"contenttype\":\"Resource\",\"lastupdatedon\":1499851152176,\"framework\":\"NCF\",\"name\":\"Test review process\",\"mimetype\":\"application/vnd.ekstep.ecml-archive\",\"objecttype\":\"Content\",\"mediatype\":\"content\",\"status\":\"Live\"}}";

    /**
     *
     */
    public static final String INVALID_DIALCODEDATA ="{\"eid\":\"SEARCH\",\"ets\":1551332806642,\"ver\":\"3.0\",\"mid\":\"LP.1551332806642.922fb715-b4ed-421c-bae4-5ec48fd4d255\",\"actor\":{\"id\":\"org.ekstep.learning.platform\",\"type\":\"System\"},\"context\":{\"channel\":\"in.ekstep\",\"pdata\":{\"id\":\"staging.ntp.learning.platform\",\"pid\":\"search-service\",\"ver\":\"1.0\"},\"env\":\"search\"},\"edata\":{\"size\":259168,\"query\":\"\",\"filters\":{},\"sort\":{},\"type\":\"all\",\"topn\":[{\"identifier\":\"mh_fm_1_topic_science_usefulandharmfulmicrobes_harmfulmicroorganismsclostridiumandothers\"},{\"identifier\":\"mh_fm_1_topic_science_classificationofplants_subkingdomangiosperms\"},{\"identifier\":\"do_21254796078943436811896\"},{\"identifier\":\"do_21253024920136089612518\"},{\"identifier\":\"do_2125457233644748801997\"}]},\"flags\":{\"tv_processed\":true,\"dd_processed\":true,\"device_location_retrieved\":false},\"type\":\"events\",\"syncts\":1551341370427,\"@timestamp\":\"2019-02-28T08:09:30.427Z\",\"ts\":\"2019-02-28T05:46:46.642+0000\",\"devicedata\":{\"statecustomcode\":\"\",\"country\":\"\",\"city\":\"\",\"countrycode\":\"\",\"state\":\"\",\"statecode\":\"\",\"districtcustom\":\"\",\"statecustomname\":\"\"},\"dialcodedata\":{\"channel\":\"\",\"batchcode\":\"\",\"publisher\":\"\",\"generatedon\":43568797685,\"publishedon\":508978490534,\"status\":true,\"objecttype\":\"\"}}";

    /**
     * case sensitive dialcode key validation
     *
     */
    public static final String INVALID_DIALCODE_KEY ="{\"eid\":\"SEARCH\",\"ets\":1551977394372,\"ver\":\"3.0\",\"mid\":\"LP.1551977394372.d18d0bdf-9fbe-42ff-ac2c-3cb7306462a6\",\"actor\":{\"id\":\"org.ekstep.learning.platform\",\"type\":\"System\"},\"context\":{\"channel\":\"505c7c48ac6dc1edc9b08f21db5a571d\",\"pdata\":{\"id\":\"prod.ntp.learning.platform\",\"pid\":\"search-service\",\"ver\":\"1.0\"},\"env\":\"search\",\"did\":\"530f35ec69f30432bd5e87eee4e7d9a82da0e129\"},\"edata\":{\"size\":14,\"query\":\"\",\"filters\":{\"channels\":\"yes\",\"dialCodes\":\"\",\"objectType\":[\"Content\",\"ContentImage\"],\"contentType\":[\"Resource\"],\"status\":[\"Live\"],\"compatibilityLevel\":{\"min\":1,\"max\":4},\"channel\":{\"ne\":[\"0124433024890224640\",\"0124446042259128320\",\"0124487522476933120\",\"0125840271570288640\",\"0124453662635048969\"]},\"framework\":{},\"mimeType\":{},\"resourceType\":{}},\"sort\":{\"me_averageRating\":\"desc\"},\"type\":\"content\",\"topn\":[{\"identifier\":\"do_31251340904692121624142\"},{\"identifier\":\"do_31257347965634969621957\"},{\"identifier\":\"do_312580373603835904112177\"},{\"identifier\":\"do_312580362281156608111821\"},{\"identifier\":\"do_312580363689975808211635\"}]},\"cdata\":[{\"id\":\"prod.diksha.app\",\"type\":\"appId\"}],\"flags\":{\"tv_processed\":true,\"dd_processed\":true,\"device_location_retrieved\":true},\"type\":\"events\",\"syncts\":1551977394569,\"@timestamp\":\"2019-03-07T16:49:54.569Z\",\"ts\":\"2019-03-07T16:49:54.372+0000\",\"devicedata\":{\"country\":\"India\",\"city\":\"Coimbatore\",\"countrycode\":\"IN\",\"state\":\"Tamil Nadu\",\"statecode\":\"TN\"}}";

    /**
     *
     */
    public static final String VALID_DIALCODETYPE ="{\"eid\":\"SEARCH\",\"ets\":1551332806642,\"ver\":\"3.0\",\"mid\":\"LP.1551332806642.922fb715-b4ed-421c-bae4-5ec48fd4d255\",\"actor\":{\"id\":\"org.ekstep.learning.platform\",\"type\":\"System\"},\"context\":{\"channel\":\"in.ekstep\",\"pdata\":{\"id\":\"staging.ntp.learning.platform\",\"pid\":\"search-service\",\"ver\":\"1.0\"},\"env\":\"search\"},\"edata\":{\"size\":259168,\"query\":\"\",\"filters\":{},\"sort\":{},\"type\":\"all\",\"topn\":[{\"identifier\":\"mh_fm_1_topic_science_usefulandharmfulmicrobes_harmfulmicroorganismsclostridiumandothers\"},{\"identifier\":\"mh_fm_1_topic_science_classificationofplants_subkingdomangiosperms\"},{\"identifier\":\"do_21254796078943436811896\"},{\"identifier\":\"do_21253024920136089612518\"},{\"identifier\":\"do_2125457233644748801997\"}]},\"flags\":{\"tv_processed\":true,\"dd_processed\":true,\"device_location_retrieved\":false},\"type\":\"events\",\"syncts\":1551341370427,\"@timestamp\":\"2019-02-28T08:09:30.427Z\",\"ts\":\"2019-02-28T05:46:46.642+0000\",\"devicedata\":{\"statecustomcode\":\"\",\"country\":\"\",\"city\":\"\",\"countrycode\":\"\",\"state\":\"\",\"statecode\":\"\",\"districtcustom\":\"\",\"statecustomname\":\"\"},\"dialcodedata\":[{\"channel\":\"\",\"batchcode\":\"\",\"publisher\":\"\",\"generatedon\":43568797685,\"publishedon\":508978490534,\"status\":\"\",\"objecttype\":\"\"},{\"channel\":\"\",\"batchcode\":\"\",\"publisher\":\"\",\"generatedon\":76854768347,\"publishedon\":508978490534,\"status\":\"\",\"objecttype\":\"\"}]}";

    /**
     * When array of object is having in the dialcodedata and which is having invalid property in one of the object in the array. ex: generatedon
     */
    public static final String INVALID_DIALCODETYPE_CASE_1 ="{\"eid\":\"SEARCH\",\"ets\":1551332806642,\"ver\":\"3.0\",\"mid\":\"LP.1551332806642.922fb715-b4ed-421c-bae4-5ec48fd4d255\",\"actor\":{\"id\":\"org.ekstep.learning.platform\",\"type\":\"System\"},\"context\":{\"channel\":\"in.ekstep\",\"pdata\":{\"id\":\"staging.ntp.learning.platform\",\"pid\":\"search-service\",\"ver\":\"1.0\"},\"env\":\"search\"},\"edata\":{\"size\":259168,\"query\":\"\",\"filters\":{},\"sort\":{},\"type\":\"all\",\"topn\":[{\"identifier\":\"mh_fm_1_topic_science_usefulandharmfulmicrobes_harmfulmicroorganismsclostridiumandothers\"},{\"identifier\":\"mh_fm_1_topic_science_classificationofplants_subkingdomangiosperms\"},{\"identifier\":\"do_21254796078943436811896\"},{\"identifier\":\"do_21253024920136089612518\"},{\"identifier\":\"do_2125457233644748801997\"}]},\"flags\":{\"tv_processed\":true,\"dd_processed\":true,\"device_location_retrieved\":false},\"type\":\"events\",\"syncts\":1551341370427,\"@timestamp\":\"2019-02-28T08:09:30.427Z\",\"ts\":\"2019-02-28T05:46:46.642+0000\",\"devicedata\":{\"statecustomcode\":\"\",\"country\":\"\",\"city\":\"\",\"countrycode\":\"\",\"state\":\"\",\"statecode\":\"\",\"districtcustom\":\"\",\"statecustomname\":\"\"},\"dialcodedata\":[{\"channel\":\"\",\"batchcode\":\"\",\"publisher\":\"\",\"generatedon\":43568797685,\"publishedon\":508978490534,\"status\":\"\",\"objecttype\":\"\"},{\"channel\":\"\",\"batchcode\":\"\",\"publisher\":\"\",\"generatedon\":\"43568797685\",\"publishedon\":508978490534,\"status\":true,\"objecttype\":\"\"}]}";

    /**
     * When dialcodedata object is having invalid properties
     */
    public static final String INVALID_DIALCODETYPE_CASE_2 ="{\"eid\":\"SEARCH\",\"ets\":1551332806642,\"ver\":\"3.0\",\"mid\":\"LP.1551332806642.922fb715-b4ed-421c-bae4-5ec48fd4d255\",\"actor\":{\"id\":\"org.ekstep.learning.platform\",\"type\":\"System\"},\"context\":{\"channel\":\"in.ekstep\",\"pdata\":{\"id\":\"staging.ntp.learning.platform\",\"pid\":\"search-service\",\"ver\":\"1.0\"},\"env\":\"search\"},\"edata\":{\"size\":259168,\"query\":\"\",\"filters\":{},\"sort\":{},\"type\":\"all\",\"topn\":[{\"identifier\":\"mh_fm_1_topic_science_usefulandharmfulmicrobes_harmfulmicroorganismsclostridiumandothers\"},{\"identifier\":\"mh_fm_1_topic_science_classificationofplants_subkingdomangiosperms\"},{\"identifier\":\"do_21254796078943436811896\"},{\"identifier\":\"do_21253024920136089612518\"},{\"identifier\":\"do_2125457233644748801997\"}]},\"flags\":{\"tv_processed\":true,\"dd_processed\":true,\"device_location_retrieved\":false},\"type\":\"events\",\"syncts\":1551341370427,\"@timestamp\":\"2019-02-28T08:09:30.427Z\",\"ts\":\"2019-02-28T05:46:46.642+0000\",\"devicedata\":{\"statecustomcode\":\"\",\"country\":\"\",\"city\":\"\",\"countrycode\":\"\",\"state\":\"\",\"statecode\":\"\",\"districtcustom\":\"\",\"statecustomname\":\"\"},\"dialcodedata\":{\"channel\":1234534534,\"batchcode\":\"\",\"publisher\":\"\",\"generatedon\":\"43568797685\",\"publishedon\":508978490534,\"status\":true,\"objecttype\":\"\"}}";

}

