package unicode;
// Kugel's "Java Code & Tools Library", Copyright (c) 1999-2007, Theossos Comp Group

/**
 * Unicode Ethiopic block with characters from u1200 to u137F.
 * @author Kugel, <i>Theossos Comp Group</i>
 * @version Unicode 4.1.0
 */
public interface Ethiopic
{
   // constant field names modified with "^ETHIOPIC " pattern 
   char SYLLABLE_HA = '\u1200';
   char SYLLABLE_HU = '\u1201';
   char SYLLABLE_HI = '\u1202';
   char SYLLABLE_HAA = '\u1203';
   char SYLLABLE_HEE = '\u1204';
   char SYLLABLE_HE = '\u1205';
   char SYLLABLE_HO = '\u1206';
   char SYLLABLE_HOA = '\u1207';
   char SYLLABLE_LA = '\u1208';
   char SYLLABLE_LU = '\u1209';
   char SYLLABLE_LI = '\u120A';
   char SYLLABLE_LAA = '\u120B';
   char SYLLABLE_LEE = '\u120C';
   char SYLLABLE_LE = '\u120D';
   char SYLLABLE_LO = '\u120E';
   char SYLLABLE_LWA = '\u120F';
   char SYLLABLE_HHA = '\u1210';
   char SYLLABLE_HHU = '\u1211';
   char SYLLABLE_HHI = '\u1212';
   char SYLLABLE_HHAA = '\u1213';
   char SYLLABLE_HHEE = '\u1214';
   char SYLLABLE_HHE = '\u1215';
   char SYLLABLE_HHO = '\u1216';
   char SYLLABLE_HHWA = '\u1217';
   char SYLLABLE_MA = '\u1218';
   char SYLLABLE_MU = '\u1219';
   char SYLLABLE_MI = '\u121A';
   char SYLLABLE_MAA = '\u121B';
   char SYLLABLE_MEE = '\u121C';
   char SYLLABLE_ME = '\u121D';
   char SYLLABLE_MO = '\u121E';
   char SYLLABLE_MWA = '\u121F';
   char SYLLABLE_SZA = '\u1220';
   char SYLLABLE_SZU = '\u1221';
   char SYLLABLE_SZI = '\u1222';
   char SYLLABLE_SZAA = '\u1223';
   char SYLLABLE_SZEE = '\u1224';
   char SYLLABLE_SZE = '\u1225';
   char SYLLABLE_SZO = '\u1226';
   char SYLLABLE_SZWA = '\u1227';
   char SYLLABLE_RA = '\u1228';
   char SYLLABLE_RU = '\u1229';
   char SYLLABLE_RI = '\u122A';
   char SYLLABLE_RAA = '\u122B';
   char SYLLABLE_REE = '\u122C';
   char SYLLABLE_RE = '\u122D';
   char SYLLABLE_RO = '\u122E';
   char SYLLABLE_RWA = '\u122F';
   char SYLLABLE_SA = '\u1230';
   char SYLLABLE_SU = '\u1231';
   char SYLLABLE_SI = '\u1232';
   char SYLLABLE_SAA = '\u1233';
   char SYLLABLE_SEE = '\u1234';
   char SYLLABLE_SE = '\u1235';
   char SYLLABLE_SO = '\u1236';
   char SYLLABLE_SWA = '\u1237';
   char SYLLABLE_SHA = '\u1238';
   char SYLLABLE_SHU = '\u1239';
   char SYLLABLE_SHI = '\u123A';
   char SYLLABLE_SHAA = '\u123B';
   char SYLLABLE_SHEE = '\u123C';
   char SYLLABLE_SHE = '\u123D';
   char SYLLABLE_SHO = '\u123E';
   char SYLLABLE_SHWA = '\u123F';
   char SYLLABLE_QA = '\u1240';
   char SYLLABLE_QU = '\u1241';
   char SYLLABLE_QI = '\u1242';
   char SYLLABLE_QAA = '\u1243';
   char SYLLABLE_QEE = '\u1244';
   char SYLLABLE_QE = '\u1245';
   char SYLLABLE_QO = '\u1246';
   char SYLLABLE_QOA = '\u1247';
   char SYLLABLE_QWA = '\u1248';
   char SYLLABLE_QWI = '\u124A';
   char SYLLABLE_QWAA = '\u124B';
   char SYLLABLE_QWEE = '\u124C';
   char SYLLABLE_QWE = '\u124D';
   char SYLLABLE_QHA = '\u1250';
   char SYLLABLE_QHU = '\u1251';
   char SYLLABLE_QHI = '\u1252';
   char SYLLABLE_QHAA = '\u1253';
   char SYLLABLE_QHEE = '\u1254';
   char SYLLABLE_QHE = '\u1255';
   char SYLLABLE_QHO = '\u1256';
   char SYLLABLE_QHWA = '\u1258';
   char SYLLABLE_QHWI = '\u125A';
   char SYLLABLE_QHWAA = '\u125B';
   char SYLLABLE_QHWEE = '\u125C';
   char SYLLABLE_QHWE = '\u125D';
   char SYLLABLE_BA = '\u1260';
   char SYLLABLE_BU = '\u1261';
   char SYLLABLE_BI = '\u1262';
   char SYLLABLE_BAA = '\u1263';
   char SYLLABLE_BEE = '\u1264';
   char SYLLABLE_BE = '\u1265';
   char SYLLABLE_BO = '\u1266';
   char SYLLABLE_BWA = '\u1267';
   char SYLLABLE_VA = '\u1268';
   char SYLLABLE_VU = '\u1269';
   char SYLLABLE_VI = '\u126A';
   char SYLLABLE_VAA = '\u126B';
   char SYLLABLE_VEE = '\u126C';
   char SYLLABLE_VE = '\u126D';
   char SYLLABLE_VO = '\u126E';
   char SYLLABLE_VWA = '\u126F';
   char SYLLABLE_TA = '\u1270';
   char SYLLABLE_TU = '\u1271';
   char SYLLABLE_TI = '\u1272';
   char SYLLABLE_TAA = '\u1273';
   char SYLLABLE_TEE = '\u1274';
   char SYLLABLE_TE = '\u1275';
   char SYLLABLE_TO = '\u1276';
   char SYLLABLE_TWA = '\u1277';
   char SYLLABLE_CA = '\u1278';
   char SYLLABLE_CU = '\u1279';
   char SYLLABLE_CI = '\u127A';
   char SYLLABLE_CAA = '\u127B';
   char SYLLABLE_CEE = '\u127C';
   char SYLLABLE_CE = '\u127D';
   char SYLLABLE_CO = '\u127E';
   char SYLLABLE_CWA = '\u127F';
   char SYLLABLE_XA = '\u1280';
   char SYLLABLE_XU = '\u1281';
   char SYLLABLE_XI = '\u1282';
   char SYLLABLE_XAA = '\u1283';
   char SYLLABLE_XEE = '\u1284';
   char SYLLABLE_XE = '\u1285';
   char SYLLABLE_XO = '\u1286';
   char SYLLABLE_XOA = '\u1287';
   char SYLLABLE_XWA = '\u1288';
   char SYLLABLE_XWI = '\u128A';
   char SYLLABLE_XWAA = '\u128B';
   char SYLLABLE_XWEE = '\u128C';
   char SYLLABLE_XWE = '\u128D';
   char SYLLABLE_NA = '\u1290';
   char SYLLABLE_NU = '\u1291';
   char SYLLABLE_NI = '\u1292';
   char SYLLABLE_NAA = '\u1293';
   char SYLLABLE_NEE = '\u1294';
   char SYLLABLE_NE = '\u1295';
   char SYLLABLE_NO = '\u1296';
   char SYLLABLE_NWA = '\u1297';
   char SYLLABLE_NYA = '\u1298';
   char SYLLABLE_NYU = '\u1299';
   char SYLLABLE_NYI = '\u129A';
   char SYLLABLE_NYAA = '\u129B';
   char SYLLABLE_NYEE = '\u129C';
   char SYLLABLE_NYE = '\u129D';
   char SYLLABLE_NYO = '\u129E';
   char SYLLABLE_NYWA = '\u129F';
   char SYLLABLE_GLOTTAL_A = '\u12A0';
   char SYLLABLE_GLOTTAL_U = '\u12A1';
   char SYLLABLE_GLOTTAL_I = '\u12A2';
   char SYLLABLE_GLOTTAL_AA = '\u12A3';
   char SYLLABLE_GLOTTAL_EE = '\u12A4';
   char SYLLABLE_GLOTTAL_E = '\u12A5';
   char SYLLABLE_GLOTTAL_O = '\u12A6';
   char SYLLABLE_GLOTTAL_WA = '\u12A7';
   char SYLLABLE_KA = '\u12A8';
   char SYLLABLE_KU = '\u12A9';
   char SYLLABLE_KI = '\u12AA';
   char SYLLABLE_KAA = '\u12AB';
   char SYLLABLE_KEE = '\u12AC';
   char SYLLABLE_KE = '\u12AD';
   char SYLLABLE_KO = '\u12AE';
   char SYLLABLE_KOA = '\u12AF';
   char SYLLABLE_KWA = '\u12B0';
   char SYLLABLE_KWI = '\u12B2';
   char SYLLABLE_KWAA = '\u12B3';
   char SYLLABLE_KWEE = '\u12B4';
   char SYLLABLE_KWE = '\u12B5';
   char SYLLABLE_KXA = '\u12B8';
   char SYLLABLE_KXU = '\u12B9';
   char SYLLABLE_KXI = '\u12BA';
   char SYLLABLE_KXAA = '\u12BB';
   char SYLLABLE_KXEE = '\u12BC';
   char SYLLABLE_KXE = '\u12BD';
   char SYLLABLE_KXO = '\u12BE';
   char SYLLABLE_KXWA = '\u12C0';
   char SYLLABLE_KXWI = '\u12C2';
   char SYLLABLE_KXWAA = '\u12C3';
   char SYLLABLE_KXWEE = '\u12C4';
   char SYLLABLE_KXWE = '\u12C5';
   char SYLLABLE_WA = '\u12C8';
   char SYLLABLE_WU = '\u12C9';
   char SYLLABLE_WI = '\u12CA';
   char SYLLABLE_WAA = '\u12CB';
   char SYLLABLE_WEE = '\u12CC';
   char SYLLABLE_WE = '\u12CD';
   char SYLLABLE_WO = '\u12CE';
   char SYLLABLE_WOA = '\u12CF';
   char SYLLABLE_PHARYNGEAL_A = '\u12D0';
   char SYLLABLE_PHARYNGEAL_U = '\u12D1';
   char SYLLABLE_PHARYNGEAL_I = '\u12D2';
   char SYLLABLE_PHARYNGEAL_AA = '\u12D3';
   char SYLLABLE_PHARYNGEAL_EE = '\u12D4';
   char SYLLABLE_PHARYNGEAL_E = '\u12D5';
   char SYLLABLE_PHARYNGEAL_O = '\u12D6';
   char SYLLABLE_ZA = '\u12D8';
   char SYLLABLE_ZU = '\u12D9';
   char SYLLABLE_ZI = '\u12DA';
   char SYLLABLE_ZAA = '\u12DB';
   char SYLLABLE_ZEE = '\u12DC';
   char SYLLABLE_ZE = '\u12DD';
   char SYLLABLE_ZO = '\u12DE';
   char SYLLABLE_ZWA = '\u12DF';
   char SYLLABLE_ZHA = '\u12E0';
   char SYLLABLE_ZHU = '\u12E1';
   char SYLLABLE_ZHI = '\u12E2';
   char SYLLABLE_ZHAA = '\u12E3';
   char SYLLABLE_ZHEE = '\u12E4';
   char SYLLABLE_ZHE = '\u12E5';
   char SYLLABLE_ZHO = '\u12E6';
   char SYLLABLE_ZHWA = '\u12E7';
   char SYLLABLE_YA = '\u12E8';
   char SYLLABLE_YU = '\u12E9';
   char SYLLABLE_YI = '\u12EA';
   char SYLLABLE_YAA = '\u12EB';
   char SYLLABLE_YEE = '\u12EC';
   char SYLLABLE_YE = '\u12ED';
   char SYLLABLE_YO = '\u12EE';
   char SYLLABLE_YOA = '\u12EF';
   char SYLLABLE_DA = '\u12F0';
   char SYLLABLE_DU = '\u12F1';
   char SYLLABLE_DI = '\u12F2';
   char SYLLABLE_DAA = '\u12F3';
   char SYLLABLE_DEE = '\u12F4';
   char SYLLABLE_DE = '\u12F5';
   char SYLLABLE_DO = '\u12F6';
   char SYLLABLE_DWA = '\u12F7';
   char SYLLABLE_DDA = '\u12F8';
   char SYLLABLE_DDU = '\u12F9';
   char SYLLABLE_DDI = '\u12FA';
   char SYLLABLE_DDAA = '\u12FB';
   char SYLLABLE_DDEE = '\u12FC';
   char SYLLABLE_DDE = '\u12FD';
   char SYLLABLE_DDO = '\u12FE';
   char SYLLABLE_DDWA = '\u12FF';
   char SYLLABLE_JA = '\u1300';
   char SYLLABLE_JU = '\u1301';
   char SYLLABLE_JI = '\u1302';
   char SYLLABLE_JAA = '\u1303';
   char SYLLABLE_JEE = '\u1304';
   char SYLLABLE_JE = '\u1305';
   char SYLLABLE_JO = '\u1306';
   char SYLLABLE_JWA = '\u1307';
   char SYLLABLE_GA = '\u1308';
   char SYLLABLE_GU = '\u1309';
   char SYLLABLE_GI = '\u130A';
   char SYLLABLE_GAA = '\u130B';
   char SYLLABLE_GEE = '\u130C';
   char SYLLABLE_GE = '\u130D';
   char SYLLABLE_GO = '\u130E';
   char SYLLABLE_GOA = '\u130F';
   char SYLLABLE_GWA = '\u1310';
   char SYLLABLE_GWI = '\u1312';
   char SYLLABLE_GWAA = '\u1313';
   char SYLLABLE_GWEE = '\u1314';
   char SYLLABLE_GWE = '\u1315';
   char SYLLABLE_GGA = '\u1318';
   char SYLLABLE_GGU = '\u1319';
   char SYLLABLE_GGI = '\u131A';
   char SYLLABLE_GGAA = '\u131B';
   char SYLLABLE_GGEE = '\u131C';
   char SYLLABLE_GGE = '\u131D';
   char SYLLABLE_GGO = '\u131E';
   char SYLLABLE_GGWAA = '\u131F';
   char SYLLABLE_THA = '\u1320';
   char SYLLABLE_THU = '\u1321';
   char SYLLABLE_THI = '\u1322';
   char SYLLABLE_THAA = '\u1323';
   char SYLLABLE_THEE = '\u1324';
   char SYLLABLE_THE = '\u1325';
   char SYLLABLE_THO = '\u1326';
   char SYLLABLE_THWA = '\u1327';
   char SYLLABLE_CHA = '\u1328';
   char SYLLABLE_CHU = '\u1329';
   char SYLLABLE_CHI = '\u132A';
   char SYLLABLE_CHAA = '\u132B';
   char SYLLABLE_CHEE = '\u132C';
   char SYLLABLE_CHE = '\u132D';
   char SYLLABLE_CHO = '\u132E';
   char SYLLABLE_CHWA = '\u132F';
   char SYLLABLE_PHA = '\u1330';
   char SYLLABLE_PHU = '\u1331';
   char SYLLABLE_PHI = '\u1332';
   char SYLLABLE_PHAA = '\u1333';
   char SYLLABLE_PHEE = '\u1334';
   char SYLLABLE_PHE = '\u1335';
   char SYLLABLE_PHO = '\u1336';
   char SYLLABLE_PHWA = '\u1337';
   char SYLLABLE_TSA = '\u1338';
   char SYLLABLE_TSU = '\u1339';
   char SYLLABLE_TSI = '\u133A';
   char SYLLABLE_TSAA = '\u133B';
   char SYLLABLE_TSEE = '\u133C';
   char SYLLABLE_TSE = '\u133D';
   char SYLLABLE_TSO = '\u133E';
   char SYLLABLE_TSWA = '\u133F';
   char SYLLABLE_TZA = '\u1340';
   char SYLLABLE_TZU = '\u1341';
   char SYLLABLE_TZI = '\u1342';
   char SYLLABLE_TZAA = '\u1343';
   char SYLLABLE_TZEE = '\u1344';
   char SYLLABLE_TZE = '\u1345';
   char SYLLABLE_TZO = '\u1346';
   char SYLLABLE_TZOA = '\u1347';
   char SYLLABLE_FA = '\u1348';
   char SYLLABLE_FU = '\u1349';
   char SYLLABLE_FI = '\u134A';
   char SYLLABLE_FAA = '\u134B';
   char SYLLABLE_FEE = '\u134C';
   char SYLLABLE_FE = '\u134D';
   char SYLLABLE_FO = '\u134E';
   char SYLLABLE_FWA = '\u134F';
   char SYLLABLE_PA = '\u1350';
   char SYLLABLE_PU = '\u1351';
   char SYLLABLE_PI = '\u1352';
   char SYLLABLE_PAA = '\u1353';
   char SYLLABLE_PEE = '\u1354';
   char SYLLABLE_PE = '\u1355';
   char SYLLABLE_PO = '\u1356';
   char SYLLABLE_PWA = '\u1357';
   char SYLLABLE_RYA = '\u1358';
   char SYLLABLE_MYA = '\u1359';
   char SYLLABLE_FYA = '\u135A';
   char COMBINING_GEMINATION_MARK = '\u135F';
   char SECTION_MARK = '\u1360';
   char WORDSPACE = '\u1361';
   char FULL_STOP = '\u1362';
   char COMMA = '\u1363';
   char SEMICOLON = '\u1364';
   char COLON = '\u1365';
   char PREFACE_COLON = '\u1366';
   char QUESTION_MARK = '\u1367';
   char PARAGRAPH_SEPARATOR = '\u1368';
   char DIGIT_ONE = '\u1369';
   char DIGIT_TWO = '\u136A';
   char DIGIT_THREE = '\u136B';
   char DIGIT_FOUR = '\u136C';
   char DIGIT_FIVE = '\u136D';
   char DIGIT_SIX = '\u136E';
   char DIGIT_SEVEN = '\u136F';
   char DIGIT_EIGHT = '\u1370';
   char DIGIT_NINE = '\u1371';
   char NUMBER_TEN = '\u1372';
   char NUMBER_TWENTY = '\u1373';
   char NUMBER_THIRTY = '\u1374';
   char NUMBER_FORTY = '\u1375';
   char NUMBER_FIFTY = '\u1376';
   char NUMBER_SIXTY = '\u1377';
   char NUMBER_SEVENTY = '\u1378';
   char NUMBER_EIGHTY = '\u1379';
   char NUMBER_NINETY = '\u137A';
   char NUMBER_HUNDRED = '\u137B';
   char NUMBER_TEN_THOUSAND = '\u137C';
}
