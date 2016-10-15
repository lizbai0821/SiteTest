/**
  * Created by lizbai on 15/10/16.
  */
case class Streaming (
                       SID:          Long,
                       PROBEID:      Long,
                       IntERFACEID:  Int,
                       GROUPID:      Int,
                       GGSN_ID:      Long,
                       SGSN_ID:      Long,
                       SESSION_INDICATOR:          Int,
                       BEGIN_TIME:   Long,
                       BEGIN_TIME_MSEL:            Int,
                       END_TIME:     Long,
                       END_TIME_MSEL:Int,
                       PROT_CATEGORY:Int,
                       PROT_TYPE:    Int,
                       L7_CARRIER_PROT:            Int,
                       MSISDN:       String,
                       IMSI:         String,
                       IMEI:         String,
                       ENCRYPT_VERSION:            Int,
                       ROAMING_TYPE: Int,
                       ROAM_DIRECTION:             Int,
                       MS_IP:        String,
                       SERVER_IP:    String,
                       MS_PORT:      Int,
                       SERVER_PORT:  Int,
                       APN:          String,
                       SGSN_SIG_IP:  String,
                       GGSN_SIG_IP:  String,
                       SGSN_USER_IP: String,
                       GGSN_USER_IP: String,
                       MCC:          String,
                       MNC:          String,
                       RAT:          Int,
                       LAC:          String,
                       RAC:          String,
                       SAC:          String,
                       CI:           String,
                       BROWSER_TYPE: Int,
                       L4_UL_THROUGHPUT:           Long,
                       L4_DW_THROUGHPUT:           Long,
                       L4_UL_GOODPUT:Long,
                       L4_DW_GOODPUT:Long,
                       NETWORK_UL_TRAFFIC:         Long,
                       NETWORK_DL_TRAFFIC:         Long,
                       L4_UL_PACKETS:Long,
                       L4_DW_PACKETS:Long,
                       TCP_CONN_STATES:            Int,
                       TCP_STATES:   Int,
                       TCP_RTT:      Long,
                       TCP_UL_OUTOFSEQU:           Long,
                       TCP_DW_OUTOFSEQU:           Long,
                       TCP_UL_RETRANS:             Long,
                       TCP_DW_RETRANS:             Long,
                       TCP_WIN_SIZE: Int,
                       TCP_MSS:      Int,
                       TCP_CONN_TIMES:             Int,
                       TCP_CONN_2_FAILED_TIMES:    Int,
                       TCP_CONN_3_FAILED_TIMES:    Int,
                       HOST:         String,
                       STREAMING_URL:String,
                       GET_STREAMING_FAILED_CODE:  Int,
                       GET_STREAMING_FLAG:         Int,
                       GET_STREAMING_DELAY:        Long,
                       GET_NUM:      Int,
                       GET_SUCCEED_NUM:            Int,
                       GET_RETRANS_NUM:            Int,
                       GET_TIMEOUT_NUM:            Int,
                       GET_MAX_UL_SIZE:            Long,
                       GET_MIN_UL_SIZE:            Long,
                       GET_MAX_DL_SIZE:            Long,
                       GET_MIN_DL_SIZE:            Long,
                       IntBUFFER_FST_FLAG:         Int,
                       IntBUFFER_FULL_FLAG:        Int,
                       IntBUFFER_FULL_DELAY:       Long,
                       STALL_NUM:    Int,
                       STALL_DURATION:             Long,
                       STREAMING_DW_PACKETS:       Long,
                       STREAMING_DOWNLOAD_DELAY:   Long,
                       PLAY_DURATION:Long,
                       STREAMING_QUALITY:          Int,
                       VIDEO_DATA_RATE:            Long,
                       VIDEO_FRAME_RATE:           Int,
                       VIDEO_CODEC_ID:             String,
                       VIDEO_WIDTH:  Int,
                       VIDEO_HEIGHT: Int,
                       AUDIO_DATA_RATE:            Long,
                       AUDIO_CODEC_ID:             String,
                       STREAMING_FILESIZE:         Long,
                       STREAMING_DURATIOIN:        Long,
                       MEDIA_FILE_TYPE:            Int,
                       PLAY_STATE:   Int,
                       STREAMING_FLAG:             Int,
                       TCP_STATUS_INDICATOR:       Int,
                       DISCONNECTION_FLAG:         Int,
                       FAILURE_CODE: Int,
                       FLAG:         Int,
                       FLOW_SAMPLE_RATIO:          Int,
                       TAC:          String,
                       ECI:          String,
                       TCP_SYN_TIME: Long,
                       TCP_SYN_TIME_MSEL:          Int,
                       TCP_RTT_STEP1:Long,
                       TCP_UL_RETRANS_WITHPL:      Long,
                       TCP_DW_RETRANS_WITHPL:      Long,
                       TCP_UL_RETRANS_WITHOUTPL:   Long,
                       TCP_DW_RETRANS_WITHOUTPL:   Long,
                       TCP_UL_PACKAGES_WITHPL:     Long,
                       TCP_DW_PACKAGES_WITHPL:     Long,
                       TCP_UL_PACKAGES_WITHOUTPL:  Long,
                       TCP_DW_PACKAGES_WITHOUTPL:  Long,
                       UPPERLAYER_IP_UL_PACKETS:   Long,
                       UPPERLAYER_IP_DL_PACKETS:   Long,
                       DOWNLAYER_IP_UL_PACKETS:    Long,
                       DOWNLAYER_IP_DL_PACKETS:    Long,
                       UPPERLAYER_IP_UL_FRAGMENTS: Long,
                       UPPERLAYER_IP_DL_FRAGMENTS: Long,
                       DOWNLAYER_IP_UL_FRAGMENTS:  Long,
                       DOWNLAYER_IP_DL_FRAGMENTS:  Long,
                       SERVICE_DELAY_MSEC:         Long,
                       VALID_TRANS_DURATION:       Long,
                       AIR_PORT_DURATION:          Long,
                       RADIO_CONN_TIMES:           Long,
                       TCP_FST_SYN_DIRECTION:      Int,
                       RAN_NE_ID:    Long,
                       RAN_NE_USER_IP:             String,
                       HOMEMCC:      String,
                       HOMEMNC:      String,
                       HOMEPROVINCE: Long,
                       HOMECITY:     Long,
                       SERVICE_ID:   Long,
                       CHARGING_CLASS:             Long,
                       CHARGE_FLAG:  Int,
                       PREPAID_FLAG: Int,
                       USER_AGENT:   String,
                       DATATRANS_UL_DURATION:      Long,
                       MS_WIN_STAT_TOTAL_NUM:      Int,
                       MS_WIN_STAT_SMALL_NUM:      Int,
                       MS_ACK_TO_1STGET_DELAY:     Int,
                       SERVER_ACK_TO_1STDATA_DELAY:Int,
                       AVG_UL_RTT:   Long,
                       AVG_DW_RTT:   Long,
                       UL_RTT_LONG_NUM:            Int,
                       DW_RTT_LONG_NUM:            Int,
                       UL_RTT_STAT_NUM:            Int,
                       DW_RTT_STAT_NUM:            Int,
                       USER_PROBE_UL_LOST_PKT:     Int,
                       SERVER_PROBE_UL_LOST_PKT:   Int,
                       SERVER_PROBE_DW_LOST_PKT:   Int,
                       USER_PROBE_DW_LOST_PKT:     Int,
                       STREAMING_TYPE:             Int,
                       ASSOCIATED_ID:Long,
                       SOURCE_VIDEO_QUALITY:       Int,
                       PACKET_LOSS_NUM:            Long,
                       JITTER:       Long,
                       TETHERING_FLAG:             Int,
                       CARRIER_ID:   Long,
                       LAYER1ID:     Int,
                       LAYER2ID:     Int,
                       LAYER3ID:     Int,
                       LAYER4ID:     Int,
                       LAYER5ID:     Int,
                       LAYER6ID:     Int,
                       CHARGING_CHARACTERISTICS:   Long,
                       CHARGING_RULE_BASE_NAME:    String,
                       MS_DNS_DELAY_MSEL:          Long,
                       SP:           String,
                       DL_SERIOUS_OUT_OF_ORDER_NUM:Long,
                       DL_SLIGHT_OUT_OF_ORDER_NUM: Long,
                       DL_FLIGHT_TOTAL_SIZE:       Long,
                       DL_FLIGHT_TOTAL_NUM:        Long,
                       DL_MAX_FLIGHT_SIZE:         Long,
                       UL_SERIOUS_OUT_OF_ORDER_NUM:Long,
                       UL_SLIGHT_OUT_OF_ORDER_NUM: Long,
                       UL_FLIGHT_TOTAL_SIZE:       Long,
                       UL_FLIGHT_TOTAL_NUM:        Long,
                       UL_MAX_FLIGHT_SIZE:         Long,
                       USER_DL_SLIGHT_OUT_OF_ORDER_PACKETS:      Long,
                       SERVER_UL_SLIGHT_OUT_OF_ORDER_PACKETS:    Long,
                       DL_CONTINUOUS_RETRANSMISSION_DELAY:       Long,
                       USER_HUNGRY_DELAY:          Long,
                       SERVER_HUNGRY_DELAY:        Long,
                       CHARGE_ID:    Long,
                       EXTENDED_URL: String,
                       SV:           String,
                       FIRST_SAI_CGI_ECGI:         String,
                       EXTENDED_URL_OTHER:         String,
                       SIGNALING_USE_FLAG:         Int,
                       DNS_RETRANS_NUM:            Int,
                       DNS_FAIL_CODE:Int,
FIRST_RAT:    Int,
SUB_PROT_TYPE:Int,
MS_INDICATOR: String,
LAST_SAI_CGI_ECGI:          String,
LAST_RAT:     Int,
FIRST_LONGITUDE:            Long,
FIRST_LATITUDE:             Long,
FIRST_ALTITUDE:             Int,
FIRST_RASTERLONGITUDE:      Long,
FIRST_RASTERLATITUDE:       Long,
FIRST_RASTERALTITUDE:       Int,
FIRST_FREQUENCYSPOT:        Int,
FIRST_CLUTTER:Int,
FIRST_USERBEHAVIOR:         Int,
FIRST_SPEED:  Int,
FIRST_CREDIBILITY:          Int,
LAST_LONGITUDE:             Long,
LAST_LATITUDE:Long,
LAST_ALTITUDE:Int,
LAST_RASTERLONGITUDE:       Long,
LAST_RASTERLATITUDE:        Long,
LAST_RASTERALTITUDE:        Int,
LAST_FREQUENCYSPOT:         Int,
LAST_CLUTTER: Int,
LAST_USERBEHAVIOR:          Int,
LAST_SPEED:   Int,
LAST_CREDIBILITY:           Int,
IMEI_CIPHERTEXT:            String,
UL_REVERSE_TO_DL_DELAY:     Long,
DL_REVERSE_TO_UL_DELAY:     Long,
APP_ID:       Int,
DATATRANS_DW_GOODPUT:       Long,
DATATRANS_DW_TOTAL_DURATION:Long,
SUM_FRAGMENT_IntERVAL:      Long,
DOMAIN_NAME:  String,
TCP_FIN_TIMES:Long,
TCP_RESET_TIMES:            Long,
URL_CLASSIFICATION:         Long,
STREAMING_LQ_DURATIOIN:     Long,
STREAMING_CACHE_IP:         String,
MAX_DNS_DELAY:Long,
MAX_DNS2SYN:  Long,
MAX_LATANCY_OF_LINK_SETUP:  Long,
MAX_SYNACK2FIRSTACK:        Long,
MAX_SYNACK2LASTACK:         Long,
MAX_ACK2GET_DELAY:          Long,
MAX_FRAG_IntERVAL_PREDELAY: Long,
SUM_FRAG_IntERVAL_PREDELAY: Long,
STOP_LONGER_THAN_MIN_THRESHOLD:           Int,
STOP_LONGER_THAN_MAX_THRESHOLD:           Int,
PLAY_END_STAT:Int,
STOP_START_TIME1:           Long,
STOP_END_TIME1:             Long,
STOP_START_TIME2:           Long,
STOP_END_TIME2:             Long,
STOP_START_TIME3:           Long,
STOP_END_TIME3:             Long,
STOP_START_TIME4:           Long,
STOP_END_TIME4:             Long,
STOP_START_TIME5:           Long,
STOP_END_TIME5:             Long,
STOP_START_TIME6:           Long,
STOP_END_TIME6:             Long,
STOP_START_TIME7:           Long,
STOP_END_TIME7:             Long,
STOP_START_TIME8:           Long,
STOP_END_TIME8:             Long,
STOP_START_TIME9:           Long,
STOP_END_TIME9:             Long,
STOP_START_TIME10:          Long,
STOP_END_TIME10:            Long,
FAIL_CLASS:   Long,
RECORD_TYPE:  Long,
NODATA_COUNT: Long,
VIDEO_NODATA_DURATION:      Long,
VIDEO_SMOOTH_DURATION:      Long,
VIDEO_SD_DURATION:          Long,
VIDEO_HD_DURATION:          Long,
VIDEO_UHD_DURATION:         Long,
VIDEO_FHD_DURATION:         Long,
FLUCTUATION:  Long,
START_DOWNLOAD_THROUGHPUT:  Long,
L7_UL_GOODPUT_FULL_MSS:     Long,
SESSIONKEY:   String,
FIRST_UCELLID:Long,
LAST_UCELLID: Long,
UCELLID1:     Long,
LONGITUDE1:   Long,
LATITUDE1:    Long,
UCELLID2:     Long,
LONGITUDE2:   Long,
LATITUDE2:    Long,
UCELLID3:     Long,
LONGITUDE3:   Long,
LATITUDE3:    Long,
UCELLID4:     Long,
LONGITUDE4:   Long,
LATITUDE4:    Long,
UCELLID5:     Long,
LONGITUDE5:   Long,
LATITUDE5:    Long,
UCELLID6:     Long,
LONGITUDE6:   Long,
LATITUDE6:    Long,
UCELLID7:     Long,
LONGITUDE7:   Long,
LATITUDE7:    Long,
UCELLID8:     Long,
LONGITUDE8:   Long,
LATITUDE8:    Long,
UCELLID9:     Long,
LONGITUDE9:   Long,
LATITUDE9:    Long,
UCELLID10:    Long,
LONGITUDE10:  Long,
LATITUDE10:   Long,
AVG_DW_RTT_MICRO_SEC:       Int,
AVG_UL_RTT_MICRO_SEC:       Int,
                       last_msisdn: String
){
  def this(at: Array[String]) = {
    this(
      TransferUtil.LongTransfer(at(0).trim),
      TransferUtil.LongTransfer(at(1).trim),
      TransferUtil.IntTransfer(at(2).trim),
      TransferUtil.IntTransfer(at(3).trim),
      TransferUtil.LongTransfer(at(4).trim),
      TransferUtil.LongTransfer(at(5).trim),
      TransferUtil.IntTransfer(at(6).trim),
      TransferUtil.LongTransfer(at(7).trim),
      TransferUtil.IntTransfer(at(8).trim),
      TransferUtil.LongTransfer(at(9).trim),
      TransferUtil.IntTransfer(at(10).trim),
      TransferUtil.IntTransfer(at(11).trim),
      TransferUtil.IntTransfer(at(12).trim),
      TransferUtil.IntTransfer(at(13).trim),
      at(14),
      at(15),
      at(16),
      TransferUtil.IntTransfer(at(17).trim),
      TransferUtil.IntTransfer(at(18).trim),
      TransferUtil.IntTransfer(at(19).trim),
      at(20),
      at(21),
      TransferUtil.IntTransfer(at(22).trim),
      TransferUtil.IntTransfer(at(23).trim),
      at(24),
      at(25),
      at(26),
      at(27),
      at(28),
      at(29),
      at(30),
      TransferUtil.IntTransfer(at(31).trim),
      at(32),
      at(33),
      at(34),
      at(35),
      TransferUtil.IntTransfer(at(36).trim),
      TransferUtil.LongTransfer(at(37).trim),
      TransferUtil.LongTransfer(at(38).trim),
      TransferUtil.LongTransfer(at(39).trim),
      TransferUtil.LongTransfer(at(40).trim),
      TransferUtil.LongTransfer(at(41).trim),
      TransferUtil.LongTransfer(at(42).trim),
      TransferUtil.LongTransfer(at(43).trim),
      TransferUtil.LongTransfer(at(44).trim),
      TransferUtil.IntTransfer(at(45).trim),
      TransferUtil.IntTransfer(at(46).trim),
      TransferUtil.LongTransfer(at(47).trim),
      TransferUtil.LongTransfer(at(48).trim),
      TransferUtil.LongTransfer(at(49).trim),
      TransferUtil.LongTransfer(at(50).trim),
      TransferUtil.LongTransfer(at(51).trim),
      TransferUtil.IntTransfer(at(52).trim),
      TransferUtil.IntTransfer(at(53).trim),
      TransferUtil.IntTransfer(at(54).trim),
      TransferUtil.IntTransfer(at(55).trim),
      TransferUtil.IntTransfer(at(56).trim),
      at(57),
      at(58),
      TransferUtil.IntTransfer(at(59).trim),
      TransferUtil.IntTransfer(at(60).trim),
      TransferUtil.LongTransfer(at(61).trim),
      TransferUtil.IntTransfer(at(62).trim),
      TransferUtil.IntTransfer(at(63).trim),
      TransferUtil.IntTransfer(at(64).trim),
      TransferUtil.IntTransfer(at(65).trim),
      TransferUtil.LongTransfer(at(66).trim),
      TransferUtil.LongTransfer(at(67).trim),
      TransferUtil.LongTransfer(at(68).trim),
      TransferUtil.LongTransfer(at(69).trim),
      TransferUtil.IntTransfer(at(70).trim),
      TransferUtil.IntTransfer(at(71).trim),
      TransferUtil.LongTransfer(at(72).trim),
      TransferUtil.IntTransfer(at(73).trim),
      TransferUtil.LongTransfer(at(74).trim),
      TransferUtil.LongTransfer(at(75).trim),
      TransferUtil.LongTransfer(at(76).trim),
      TransferUtil.LongTransfer(at(77).trim),
      TransferUtil.IntTransfer(at(78).trim),
      TransferUtil.LongTransfer(at(79).trim),
      TransferUtil.IntTransfer(at(80).trim),
      at(81),
      TransferUtil.IntTransfer(at(82).trim),
      TransferUtil.IntTransfer(at(83).trim),
      TransferUtil.LongTransfer(at(84).trim),
      at(85),
      TransferUtil.LongTransfer(at(86).trim),
      TransferUtil.LongTransfer(at(87).trim),
      TransferUtil.IntTransfer(at(88).trim),
      TransferUtil.IntTransfer(at(89).trim),
      TransferUtil.IntTransfer(at(90).trim),
      TransferUtil.IntTransfer(at(91).trim),
      TransferUtil.IntTransfer(at(92).trim),
      TransferUtil.IntTransfer(at(93).trim),
      TransferUtil.IntTransfer(at(94).trim),
      TransferUtil.IntTransfer(at(95).trim),
      at(96),
      at(97),
      TransferUtil.LongTransfer(at(98).trim),
      TransferUtil.IntTransfer(at(99).trim),
      TransferUtil.LongTransfer(at(100).trim),
      TransferUtil.LongTransfer(at(101).trim),
      TransferUtil.LongTransfer(at(102).trim),
      TransferUtil.LongTransfer(at(103).trim),
      TransferUtil.LongTransfer(at(104).trim),
      TransferUtil.LongTransfer(at(105).trim),
      TransferUtil.LongTransfer(at(106).trim),
      TransferUtil.LongTransfer(at(107).trim),
      TransferUtil.LongTransfer(at(108).trim),
      TransferUtil.LongTransfer(at(109).trim),
      TransferUtil.LongTransfer(at(110).trim),
      TransferUtil.LongTransfer(at(111).trim),
      TransferUtil.LongTransfer(at(112).trim),
      TransferUtil.LongTransfer(at(113).trim),
      TransferUtil.LongTransfer(at(114).trim),
      TransferUtil.LongTransfer(at(115).trim),
      TransferUtil.LongTransfer(at(116).trim),
      TransferUtil.LongTransfer(at(117).trim),
      TransferUtil.LongTransfer(at(118).trim),
      TransferUtil.LongTransfer(at(119).trim),
      TransferUtil.LongTransfer(at(120).trim),
      TransferUtil.IntTransfer(at(121).trim),
      TransferUtil.LongTransfer(at(122).trim),
      at(123),
      at(124),
      at(125),
      TransferUtil.LongTransfer(at(126).trim),
      TransferUtil.LongTransfer(at(127).trim),
      TransferUtil.LongTransfer(at(128).trim),
      TransferUtil.LongTransfer(at(129).trim),
      TransferUtil.IntTransfer(at(130).trim),
      TransferUtil.IntTransfer(at(131).trim),
      at(132),
      TransferUtil.LongTransfer(at(133).trim),
      TransferUtil.IntTransfer(at(134).trim),
      TransferUtil.IntTransfer(at(135).trim),
      TransferUtil.IntTransfer(at(136).trim),
      TransferUtil.IntTransfer(at(137).trim),
      TransferUtil.LongTransfer(at(138).trim),
      TransferUtil.LongTransfer(at(139).trim),
      TransferUtil.IntTransfer(at(140).trim),
      TransferUtil.IntTransfer(at(141).trim),
      TransferUtil.IntTransfer(at(142).trim),
      TransferUtil.IntTransfer(at(143).trim),
      TransferUtil.IntTransfer(at(144).trim),
      TransferUtil.IntTransfer(at(145).trim),
      TransferUtil.IntTransfer(at(146).trim),
      TransferUtil.IntTransfer(at(147).trim),
      TransferUtil.IntTransfer(at(148).trim),
      TransferUtil.LongTransfer(at(149).trim),
      TransferUtil.IntTransfer(at(150).trim),
      TransferUtil.LongTransfer(at(151).trim),
      TransferUtil.LongTransfer(at(152).trim),
      TransferUtil.IntTransfer(at(153).trim),
      TransferUtil.LongTransfer(at(154).trim),
      TransferUtil.IntTransfer(at(155).trim),
      TransferUtil.IntTransfer(at(156).trim),
      TransferUtil.IntTransfer(at(157).trim),
      TransferUtil.IntTransfer(at(158).trim),
      TransferUtil.IntTransfer(at(159).trim),
      TransferUtil.IntTransfer(at(160).trim),
      TransferUtil.LongTransfer(at(161).trim),
      at(162),
      TransferUtil.LongTransfer(at(163).trim),
      at(164),
      TransferUtil.LongTransfer(at(165).trim),
      TransferUtil.LongTransfer(at(166).trim),
      TransferUtil.LongTransfer(at(167).trim),
      TransferUtil.LongTransfer(at(168).trim),
      TransferUtil.LongTransfer(at(169).trim),
      TransferUtil.LongTransfer(at(170).trim),
      TransferUtil.LongTransfer(at(171).trim),
      TransferUtil.LongTransfer(at(172).trim),
      TransferUtil.LongTransfer(at(173).trim),
      TransferUtil.LongTransfer(at(174).trim),
      TransferUtil.LongTransfer(at(175).trim),
      TransferUtil.LongTransfer(at(176).trim),
      TransferUtil.LongTransfer(at(177).trim),
      TransferUtil.LongTransfer(at(178).trim),
      TransferUtil.LongTransfer(at(179).trim),
      TransferUtil.LongTransfer(at(180).trim),
      at(181),
      at(182),
      at(183),
      at(184),
      TransferUtil.IntTransfer(at(185).trim),
      TransferUtil.IntTransfer(at(186).trim),
      TransferUtil.IntTransfer(at(187).trim),
      TransferUtil.IntTransfer(at(188).trim),
      TransferUtil.IntTransfer(at(189).trim),
      at(190),
      at(191),
      TransferUtil.IntTransfer(at(192).trim),
      TransferUtil.LongTransfer(at(193).trim),
      TransferUtil.LongTransfer(at(194).trim),
      TransferUtil.IntTransfer(at(195).trim),
      TransferUtil.LongTransfer(at(196).trim),
      TransferUtil.LongTransfer(at(197).trim),
      TransferUtil.IntTransfer(at(198).trim),
      TransferUtil.IntTransfer(at(199).trim),
      TransferUtil.IntTransfer(at(200).trim),
      TransferUtil.IntTransfer(at(201).trim),
      TransferUtil.IntTransfer(at(202).trim),
      TransferUtil.IntTransfer(at(203).trim),
      TransferUtil.LongTransfer(at(204).trim),
      TransferUtil.LongTransfer(at(205).trim),
      TransferUtil.IntTransfer(at(206).trim),
      TransferUtil.LongTransfer(at(207).trim),
      TransferUtil.LongTransfer(at(208).trim),
      TransferUtil.IntTransfer(at(209).trim),
      TransferUtil.IntTransfer(at(210).trim),
      TransferUtil.IntTransfer(at(211).trim),
      TransferUtil.IntTransfer(at(212).trim),
      LTransferUtil.IntTransfer(at(213).trim),
      TransferUtil.IntTransfer(at(214).trim),
      at(215),
      TransferUtil.LongTransfer(at(216).trim),
      TransferUtil.LongTransfer(at(217).trim),
      TransferUtil.IntTransfer(at(218).trim),
      TransferUtil.LongTransfer(at(219).trim),
      TransferUtil.LongTransfer(at(220).trim),
      TransferUtil.LongTransfer(at(221).trim),
      at(222),
      TransferUtil.LongTransfer(at(223).trim),
      TransferUtil.LongTransfer(at(224).trim),
      TransferUtil.LongTransfer(at(225).trim),
      TransferUtil.LongTransfer(at(226).trim),
      at(227),
      TransferUtil.LongTransfer(at(228).trim),
      TransferUtil.LongTransfer(at(229).trim),
      TransferUtil.LongTransfer(at(230).trim),
      TransferUtil.LongTransfer(at(231).trim),
      TransferUtil.LongTransfer(at(232).trim),
      TransferUtil.LongTransfer(at(233).trim),
      TransferUtil.LongTransfer(at(234).trim),
      TransferUtil.LongTransfer(at(235).trim),
      TransferUtil.IntTransfer(at(236).trim),
      TransferUtil.IntTransfer(at(237).trim),
      TransferUtil.IntTransfer(at(238).trim),
      TransferUtil.LongTransfer(at(239).trim),
      TransferUtil.LongTransfer(at(240).trim),
      TransferUtil.LongTransfer(at(241).trim),
      TransferUtil.LongTransfer(at(242).trim),
      TransferUtil.LongTransfer(at(243).trim),
      TransferUtil.LongTransfer(at(244).trim),
      TransferUtil.LongTransfer(at(245).trim),
      TransferUtil.LongTransfer(at(246).trim),
      TransferUtil.LongTransfer(at(247).trim),
      TransferUtil.LongTransfer(at(248).trim),
      TransferUtil.LongTransfer(at(249).trim),
      TransferUtil.LongTransfer(at(250).trim),
      TransferUtil.LongTransfer(at(251).trim),
      TransferUtil.LongTransfer(at(252).trim),
      TransferUtil.LongTransfer(at(253).trim),
      TransferUtil.LongTransfer(at(254).trim),
      TransferUtil.LongTransfer(at(255).trim),
      TransferUtil.LongTransfer(at(256).trim),
      TransferUtil.LongTransfer(at(257).trim),
      TransferUtil.LongTransfer(at(258).trim),
      TransferUtil.LongTransfer(at(259).trim),
      TransferUtil.LongTransfer(at(260).trim),
      TransferUtil.LongTransfer(at(261).trim),
      TransferUtil.LongTransfer(at(262).trim),
      TransferUtil.LongTransfer(at(263).trim),
      TransferUtil.LongTransfer(at(264).trim),
      TransferUtil.LongTransfer(at(265).trim),
      TransferUtil.LongTransfer(at(266).trim),
      TransferUtil.LongTransfer(at(267).trim),
      TransferUtil.LongTransfer(at(268).trim),
      TransferUtil.LongTransfer(at(269).trim),
      TransferUtil.LongTransfer(at(270).trim),
      TransferUtil.LongTransfer(at(271).trim),
      TransferUtil.LongTransfer(at(272).trim),
      TransferUtil.LongTransfer(at(273).trim),
      TransferUtil.LongTransfer(at(274).trim),
      TransferUtil.LongTransfer(at(275).trim),
      TransferUtil.LongTransfer(at(276).trim),
      TransferUtil.LongTransfer(at(277).trim),
      TransferUtil.LongTransfer(at(278).trim),
      TransferUtil.LongTransfer(at(279).trim),
      TransferUtil.LongTransfer(at(280).trim),
      TransferUtil.LongTransfer(at(281).trim),
      TransferUtil.LongTransfer(at(282).trim),
      TransferUtil.LongTransfer(at(283).trim),
      TransferUtil.LongTransfer(at(284).trim),
      TransferUtil.LongTransfer(at(285).trim),
      TransferUtil.LongTransfer(at(286).trim),
      TransferUtil.LongTransfer(at(287).trim),
      TransferUtil.LongTransfer(at(288).trim),
      TransferUtil.LongTransfer(at(289).trim),
      TransferUtil.LongTransfer(at(290).trim),
      TransferUtil.LongTransfer(at(291).trim),
      TransferUtil.LongTransfer(at(292).trim),
      TransferUtil.LongTransfer(at(293).trim),
      TransferUtil.LongTransfer(at(294).trim),
      TransferUtil.LongTransfer(at(295).trim),
      TransferUtil.LongTransfer(at(296).trim),
      TransferUtil.LongTransfer(at(297).trim),
      TransferUtil.LongTransfer(at(298).trim),
      TransferUtil.LongTransfer(at(299).trim),
      TransferUtil.LongTransfer(at(300).trim),
      TransferUtil.LongTransfer(at(301).trim),
      TransferUtil.LongTransfer(at(302).trim),
      TransferUtil.LongTransfer(at(303).trim),
      TransferUtil.IntTransfer(at(304).trim),
      TransferUtil.IntTransfer(at(305).trim),
      TransferUtil.patitionKeyTransfer(at(14).trim)
    )
  }
}