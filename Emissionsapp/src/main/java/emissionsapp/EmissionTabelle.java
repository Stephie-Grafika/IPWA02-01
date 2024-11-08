package emissionsapp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@Named
@ApplicationScoped
public class EmissionTabelle implements Serializable {

    private List<Emission> liste = new ArrayList<Emission>();

    /* Neue Instanz von EmissionTabelle */
    public EmissionTabelle() {
        // Beispiel-Daten 
        liste.add(new Emission("Aruba", "ABW", null, null, null, null));
        
        liste.add(new Emission("Africa Eastern and Southern", "AFE", 304614720181.0, 357967510652.0, 532614140224.0, 544952503.0));

        liste.add(new Emission("Afghanistan", "AFG", 2046.87, 1078.12, 8576.15, 8709.47));

        liste.add(new Emission("Africa Western and Central", "AFW", 97190345.0, 140653453.0, 159573957.0, 215915.61));

        liste.add(new Emission("Angola", "AGO", 6564.2, 16204.16, 22801.5, 19814.5));

        liste.add(new Emission("Albania", "ALB", 6060.5, 3186.54, 4785.4, 4383.2));

        liste.add(new Emission("Andorra", "AND", 406704.0, 523952.0, 516624.0, 448884399.0));

        liste.add(new Emission("Arab World", "ARB", 632472.87, 933988.54, 1533676.6, 1765052.9));

        liste.add(new Emission("United Arab Emirates", "ARE", 55210.4, 84729.1, 162788.9, 188088.7));

        liste.add(new Emission("Argentina", "ARG", 100313.9, 132265.5, 167226.3, 154535.9));

        liste.add(new Emission("Armenia", "ARM", 19845.2, 3561.0, 4336.6, 6746.6));

        liste.add(new Emission("American Samoa", "ASM", null, null, null, null));

        liste.add(new Emission("Antigua and Barbuda", "ATG", 218.2, 312.5, 465.8, 474.6));

        liste.add(new Emission("Australia", "AUS", 263437.5, 339422.8, 395993.2, 378996.8));

        liste.add(new Emission("Austria", "AUT", 58275.7, 63538.6, 69965.1, 59142.4));

        liste.add(new Emission("Azerbaijan", "AZE", 53483.7, 27687.2, 24311.9, 34305.0));

        liste.add(new Emission("Burundi", "BDI", 187.6, 262.6, 323.3, 713.466));

        liste.add(new Emission("Belgium", "BEL", 109312.6, 117274.6, 106872.8, 85364.1));

        liste.add(new Emission("Benin", "BEN", 330.11, 1424.5, 4825.1, 7980.4));

        liste.add(new Emission("Burkina Faso", "BFA", 594.1, 1048.93, 2094.3, 5456.7));

        liste.add(new Emission("Bangladesh", "BGD", 11523.73, 20686.7, 50487.6, 85493.1));

        liste.add(new Emission("Bulgaria", "BGR", 73605.7, 43421.1, 44740.6, 34138.1));

        liste.add(new Emission("Bahrain", "BHR", 10737.46, 15876.5, 25965.7, 32470.2));

        liste.add(new Emission("Bahamas, The", "BHS", 2014.6, 2115.3, 1979.4, 2456.0));

        liste.add(new Emission("Bosnia and Herzegovina", "BIH", 23965.6, 13955.1, 20842.5, 20946.8));

        liste.add(new Emission("Belarus", "BLR", 99830.0, 52967.5, 61443.7, 54801.5));

        liste.add(new Emission("Belize", "BLZ", 340.3, 425.2, 531.2, 687.6));

        liste.add(new Emission("Bermuda", "BMU", null, null, null, null));

        liste.add(new Emission("Bolivia", "BOL", 10407.9, 8108.1, 14702.2, 18375.3));
        
        liste.add(new Emission("Brazil", "BRA", 197897.4, 313670.8, 397931.1, 414138.8));

        liste.add(new Emission("Barbados", "BRB", 1004.32, 1188.1, 1481.5, 1096.07));

        liste.add(new Emission("Brunei Darussalam", "BRN", 3260.3, 4717.9, 7170.8, 9588.0));

        liste.add(new Emission("Bhutan", "BTN", 185.39, 388.84, 493.18, 1035.2));

        liste.add(new Emission("Botswana", "BWA", 2807.4, 4033.8, 3371.7, 5763687.0));

        liste.add(new Emission("Central African Republic", "CAF", 148.0, 243.2, 174.8, 236.6));

        liste.add(new Emission("Canada", "CAN", 419492.2, 514215.1, 537091.5, 516873.7));

        liste.add(new Emission("Central Europe and the Baltics", "CEB", 991246.4, 710574.87, 708417.9, 598490.02));

        liste.add(new Emission("Switzerland", "CHE", 43326.5, 43708.8, 45207.8, 34916.1));

        liste.add(new Emission("Channel Islands", "CHI", null, null, null, null));

        liste.add(new Emission("Chile", "CHL", 30533.6, 50424.5, 69749.1, 84827.8));

        liste.add(new Emission("China", "CHN", 2173364.2, 3346525.8, 8474922.7, 10944686.2));

        liste.add(new Emission("Cote d'Ivoire", "CIV", 2705.4, 6489.4, 6350.6, 10894.9));

        liste.add(new Emission("Cameroon", "CMR", 2900.0, 5209.1, 7014.4, 9928.4));

        liste.add(new Emission("Congo, Dem. Rep.", "COD", 3179.0, 1634.93, 2653.9, 3025.6));

        liste.add(new Emission("Congo, Rep.", "COG", 3201.15, 4346986.0, 5423.35, 7153.9));

        liste.add(new Emission("Colombia", "COL", 49364.4, 58995.5, 64146.1, 79057.6));

        liste.add(new Emission("Comoros", "COM", 65.5, 104.9, 167.8, 328.2));

        liste.add(new Emission("Cabo Verde", "CPV", 183.8, 305.8, 540.7, 620.6));

        liste.add(new Emission("Costa Rica", "CRI", 2871.2, 4946.8, 7105.5, 6967.4));

        liste.add(new Emission("Caribbean small states", "CSS", 27695208097.0, 28485.22, 38301.47, 32776.99));

        liste.add(new Emission("Cuba", "CUB", 35621.6, 28353.1, 28110.0, 24327.8));

        liste.add(new Emission("Curacao", "CUW", null, null, null, null));

        liste.add(new Emission("Cayman Islands", "CYM", null, null, null, null));

        liste.add(new Emission("Cyprus", "CYP", 4591.2, 7127.7, 7898.4, 6771.8));

        liste.add(new Emission("Czechia", "CZE", 153149.3, 124716.7, 114167.6, 88835.2));

        liste.add(new Emission("Germany", "DEU", 955307.7, 830284.1, 773069.1, 603350.5));

        liste.add(new Emission("Djibouti", "DJI", 274.1, 373.4, 519.1, 427.7));

        liste.add(new Emission("Dominica", "DMA", 62.7, 125.3, 172.5, 162.8));

        liste.add(new Emission("Denmark", "DNK", 51978.0, 52602.0, 48124.8, 27356.5));

        liste.add(new Emission("Dominican Republic", "DOM", 7860.7, 18670.6, 20680.8, 22881.3));

        liste.add(new Emission("Algeria", "DZA", 62936.9, 80046.8, 114179.4, 161563.0));

        liste.add(new Emission("East Asia & Pacific (excluding high income)", "EAP", 2665961556.0, 4141518.42, 9654293.1, 12660698.2));

        liste.add(new Emission("Early-demographic dividend", "EAR", 2612523044097.0, 3867900.42, 5857230.62, 6805648307.0));

        liste.add(new Emission("East Asia & Pacific", "EAS", 4322250256.0, 6188981.82, 11863420.2, 14708135.6));

        liste.add(new Emission("Europe & Central Asia (excluding high income)", "ECA", 3838019540257.0, 2577216352393.0, 2840620.8, 2830714.8));

        liste.add(new Emission("Europe & Central Asia", "ECS", 7966959675113.0, 6507573874391.0, 6579733278439.0, 5641772700492.0));

        liste.add(new Emission("Ecuador", "ECU", 15422.6, 22051.5, 37254.0, 34431.0));

        liste.add(new Emission("Egypt, Arab Rep.", "EGY", 87745.4, 114614.4, 200313.3, 210752.3));

        liste.add(new Emission("Euro area", "EMU", 2625211.1, 2632598.97, 2502105.4, 1872835.52));

        liste.add(new Emission("Eritrea", "ERI", 0.0, 633.19, 502.95, 706.4));

        liste.add(new Emission("Spain", "ESP", 214950.6, 293314.3, 274140.6, 202705.8));

        liste.add(new Emission("Estonia", "EST", 34544.9, 14932.5, 18500.4, 7097.52));

        liste.add(new Emission("Ethiopia", "ETH", 2310.7, 3557.0, 6473.2, 18098.0));

        liste.add(new Emission("European Union", "EUU", 3567900.9, 3364061.47, 3215802.7, 2465025.42));

        liste.add(new Emission("Fragile and conflict affected situations", "FCS", 1048294010181.0, 79001143652.0, 883972857224.0, 759327426.0));

        liste.add(new Emission("Finland", "FIN", 54562.8, 55097.5, 62526.4, 36329.9));

        liste.add(new Emission("Fiji", "FJI", 712.98, 836.58, 1126.3, 1028.2));

        liste.add(new Emission("France", "FRA", 356297.9, 373235.8, 347940.1, 267154.7));

        liste.add(new Emission("Faroe Islands", "FRO", null, null, null, null));

        liste.add(new Emission("Micronesia, Fed. Sts.", "FSM", 0.0, 187.3, 105.2, 107.5));

        liste.add(new Emission("Gabon", "GAB", 4099.12, 6080.0, 5762.09, 5349.2));

        liste.add(new Emission("United Kingdom", "GBR", 561774.5, 530888.2, 482646.2, 308650.3));

        liste.add(new Emission("Georgia", "GEO", 33488.3, 4772.8, 5322.1, 10255.0));

        liste.add(new Emission("Ghana", "GHA", 2516.9, 4949.5, 10382.6, 19401.16));

        liste.add(new Emission("Gibraltar", "GIB", null, null, null, null));

        liste.add(new Emission("Guinea", "GIN", 999.1, 1494.9, 2502.8, 4537.9));

        liste.add(new Emission("Gambia, The", "GMB", 194.5, 244.8, 434.2, 611.4));

        liste.add(new Emission("Guinea-Bissau", "GNB", 171.9, 147.0, 241.0, 329.0));

        liste.add(new Emission("Equatorial Guinea", "GNQ", 69.6, 1982.3, 6047.8, 4350.4));

        liste.add(new Emission("Greece", "GRC", 75619.4, 94460.6, 87578.5, 51002.2));

        liste.add(new Emission("Grenada", "GRD", 114.9, 198.6, 273.6, 324.5));

        liste.add(new Emission("Greenland", "GRL", null, null, null, null));

        liste.add(new Emission("Guatemala", "GTM", 3932.0, 9443.3, 11477.6, 16865.2));

        liste.add(new Emission("Guam", "GUM", null, null, null, null));

        liste.add(new Emission("Guyana", "GUY", 1171.9, 1660.3, 1759.3, 2768.5));

        liste.add(new Emission("High income", "HIC", 11431204714856.0, 12857970821998.0, 12887172878439.0, 10864997070492.0));

        liste.add(new Emission("Hong Kong SAR, China", "HKG", null, null, null, null));

        liste.add(new Emission("Honduras", "HND", 2453.7, 4987.2, 7926.8, 8835.4));

        liste.add(new Emission("Heavily indebted poor countries (HIPC)", "HPC", 59679.75, 79236603.0, 143523907.0, 224996636.0));

        liste.add(new Emission("Croatia", "HRV", 20341.4, 18034.4, 19457.3, 15626.9));

        liste.add(new Emission("Haiti", "HTI", 1020.42, 1473.3, 2458.2, 3209.04));

        liste.add(new Emission("Hungary", "HUN", 67421.0, 54633.3, 47880.5, 44769.3));

        liste.add(new Emission("IBRD only", "IBD", 8932851548354.0, 10112500232393.0, 17493003.36, 20952613307.0));

        liste.add(new Emission("IDA & IBRD total", "IBT", 935584665953501.0, 10647805916045.0, 18195832897224.0, 21862973943.0));

        liste.add(new Emission("IDA total", "IDA", 422995111181.0, 535305683652.0, 702829537224.0, 910360636.0));

        liste.add(new Emission("IDA blend", "IDB", 281986.53, 355972766.0, 400194.95, 465301.4));

        liste.add(new Emission("Indonesia", "IDN", 148342.9, 280635.7, 415536.6, 563197.0));

        liste.add(new Emission("IDA only", "IDX", 141008581181.0, 179332917652.0, 302634587224.0, 445059236.0));

        liste.add(new Emission("Isle of Man", "IMN", null, null, null, null));

        liste.add(new Emission("India", "IND", 563575.4, 937858.4, 1659983.0, 2200836.3));

        liste.add(new Emission("Not classified", "INX", null, null, null, null));

        liste.add(new Emission("Ireland", "IRL", 30961.5, 42533.5, 40347.7, 33742.2));

        liste.add(new Emission("Iran, Islamic Rep.", "IRN", 198471.7, 340456.2, 541171.1, 616561.3));

        liste.add(new Emission("Iraq", "IRQ", 64206.4, 87630.5, 108550.3, 163511.5));

        liste.add(new Emission("Iceland", "ISL", 1947.46, 2225.44, 1959124.0, 1446.6));

        liste.add(new Emission("Israel", "ISR", 33805.9, 56997.3, 70520.3, 58471.8));

        liste.add(new Emission("Italy", "ITA", 405262.0, 436296.6, 405272.3, 281286.8));

        liste.add(new Emission("Jamaica", "JAM", 7466.8, 10071.4, 7479.8, 5835.6));

        liste.add(new Emission("Jordan", "JOR", 9934.0, 16268.1, 20196.8, 20974.1));

        liste.add(new Emission("Japan", "JPN", 1090508.1, 1184424.9, 1157241.8, 1014064.7));

        liste.add(new Emission("Kazakhstan", "KAZ", 237250.9, 120151999.0, 229702.2, 211896.7));

        liste.add(new Emission("Kenya", "KEN", 6269.0, 8630.2, 13424.4, 19446.8));

        liste.add(new Emission("Kyrgyz Republic", "KGZ", 22762.3, 4643.3, 6394.4, 9080.1));

        liste.add(new Emission("Cambodia", "KHM", 1260416.0, 1963.0, 5140.8, 18652.8));

        liste.add(new Emission("Kiribati", "KIR", 24.0, 35.5, 54.3, 56.9));

        liste.add(new Emission("St. Kitts and Nevis", "KNA", 113.7, 181.2, 229.2, 231.0));

        liste.add(new Emission("Korea, Rep.", "KOR", 247675.8, 447237.3, 575215.7, 569681.8));

        liste.add(new Emission("Kuwait", "KWT", 29128.4, 49838.2, 80725.6, 92308.9));

        liste.add(new Emission("Latin America & Caribbean (excluding high income)", "LAC", 734026008097.0, 1036523.12, 1293925.57, 1242200.06));

        liste.add(new Emission("Lao PDR", "LAO", 512.96, 903.07, 2877.1, 19178.9));

        liste.add(new Emission("Lebanon", "LBN", 5622.1, 15672.8, 20864.3, 21474.9));

        liste.add(new Emission("Liberia", "LBR", 453.82, 425.81, 729.76, 1179.5));

        liste.add(new Emission("Libya", "LBY", 28603.5, 44724.9, 59559.6, 44467.0));

        liste.add(new Emission("St. Lucia", "LCA", 192.8, 366.8, 507.7, 499.2));

        liste.add(new Emission("Latin America & Caribbean", "LCN", 890406328097.0, 1244867.42, 1570608.87, 1438080.03));

        liste.add(new Emission("Least developed countries: UN classification", "LDC", 66386481181.0, 110415307652.0, 21097687224.0, 351230476.0));

        liste.add(new Emission("Low income", "LIC", 180897955181.0, 156945237652.0, 196253707224.0, 179664936.0));

        liste.add(new Emission("Liechtenstein", "LIE", 198970856.0, 216859998.0, 190830439.0, 141996093.0));

        liste.add(new Emission("Sri Lanka", "LKA", 3839.2, 10928.9, 13071.8, 21846.3));

        liste.add(new Emission("Lower middle income", "LMC", 2103131876.0, 2459953196.0, 3744660.33, 4819595.8));

        liste.add(new Emission("Low & middle income", "LMY", 8813945259535.0, 10139747416045.0, 17591125597224.0, 21383256243.0));

        liste.add(new Emission("Lesotho", "LSO", 1395.5, 1747.5, 2158.8, 2311.9));

        liste.add(new Emission("Late-demographic dividend", "LTE", 6243759680257.0, 6792280742393.0, 12652493224.0, 15488347.62));

        liste.add(new Emission("Lithuania", "LTU", 32217.9, 10515.9, 12603.0, 11693.8));

        liste.add(new Emission("Luxembourg", "LUX", 11285.0, 8556.7, 11029.1, 7853.1));

        liste.add(new Emission("Latvia", "LVA", 18777.4, 6929.57, 8518.1, 6928.3));

        liste.add(new Emission("Macao SAR, China", "MAC", null, null, null, null));

        liste.add(new Emission("St. Martin (French part)", "MAF", null, null, null, null));

        liste.add(new Emission("Morocco", "MAR", 21497.8, 32876.5, 51749.5, 66719.5));

        liste.add(new Emission("Monaco", "MCO", null, null, null, null));

        liste.add(new Emission("Moldova", "MDA", 30532.1, 6709.6, 8295.1, 8611.2));

        liste.add(new Emission("Madagascar", "MDG", 891.13, 1654.02, 1869.8, 2745.45));

        liste.add(new Emission("Maldives", "MDV", 156.7, 462.2, 963.0, 1454.0));

        liste.add(new Emission("Middle East & North Africa", "MEA", 860056.96, 1326170.3, 2128654.5, 2416064.9));

        liste.add(new Emission("Mexico", "MEX", 269575.4, 379176.0, 462869.5, 383131.4));

        liste.add(new Emission("Marshall Islands", "MHL", 0.0, 102.8, 140.8, 110.0));

        liste.add(new Emission("Middle income", "MIC", 8633047304354.0, 9982802178393.0, 17394871.89, 21203591307.0));

        liste.add(new Emission("North Macedonia", "MKD", 8591.3, 8522.1, 8329.6, 6796.7));

        liste.add(new Emission("Mali", "MLI", 436.011, 1093.8, 2154.0, 4150.7));

        liste.add(new Emission("Malta", "MLT", 2314.6, 2129.2, 2586.6, 1610.7));

        liste.add(new Emission("Myanmar", "MMR", 4083.0, 9440.5, 8131.3, 33874.6));

        liste.add(new Emission("Middle East & North Africa (excluding high income)", "MNA", 532994.2, 813164.0, 1231947.5, 1370939.0));

        liste.add(new Emission("Montenegro", "MNE", 1915340257.0, 1520843393.0, 2584.2, 2527.2));

        liste.add(new Emission("Mongolia", "MNG", 12968.1, 8996.67, 14311.1, 21184.7));

        liste.add(new Emission("Northern Mariana Islands", "MNP", null, null, null, null));

        liste.add(new Emission("Mozambique", "MOZ", 1117.23, 1426.9, 2680.6, 6945.5));

        liste.add(new Emission("Mauritania", "MRT", 841.8, 1118.7, 2073.7, 3847.1));

        liste.add(new Emission("Mauritius", "MUS", 1164.1, 2431.9, 3661.8, 3720.2));

        liste.add(new Emission("Malawi", "MWI", 722.47, 875.23, 984.46, 1640.0));

        liste.add(new Emission("Malaysia", "MYS", 54615.0, 124355.9, 199867.0, 245139.3));

        liste.add(new Emission("North America", "NAC", 5264009.6, 6290022.3, 5929200.9, 4837406.2));

        liste.add(new Emission("Namibia", "NAM", null, 1942.3, 3103.5, 3952.8));

        liste.add(new Emission("New Caledonia", "NCL", null, null, null, null));

        liste.add(new Emission("Niger", "NER", 565.434, 660.227, 1361057.0, 2197.95));

        liste.add(new Emission("Nigeria", "NGA", 72768.8, 97215.1, 90055.2, 111978.1));

        liste.add(new Emission("Nicaragua", "NIC", 1933.9, 3768.0, 4513.2, 4582.2));

        liste.add(new Emission("Netherlands", "NLD", 151520.7, 162096.7, 171110.5, 130315.1));

        liste.add(new Emission("Norway", "NOR", 29305.4, 34283.1, 40116.4, 36177.4));

        liste.add(new Emission("Nepal", "NPL", 938.8, 3221.0, 4640.9, 14949.2));

        liste.add(new Emission("Nauru", "NRU", 126.3, 88.0, 42.7, 41.4));

        liste.add(new Emission("New Zealand", "NZL", 22310.7, 29455.0, 31049.3, 31359.7));

        liste.add(new Emission("OECD members", "OED", 11344058.36, 12872950.41, 12694352824.0, 10570775.72));

        liste.add(new Emission("Oman", "OMN", 11919.3, 25115.0, 47076.3, 71041.5));

        liste.add(new Emission("Other small states", "OSS", 83923170257.0, 98878823393.0, 156681794.0, 181678207.0));

        liste.add(new Emission("Pakistan", "PAK", 59026.0, 98374.1, 140378.6, 184111.2));

        liste.add(new Emission("Panama", "PAN", 2692.9, 5282.7, 9190.6, 9582.7));

        liste.add(new Emission("Peru", "PER", 20875.3, 28634.2, 44998.5, 46578.9));

        liste.add(new Emission("Philippines", "PHL", 40868.9, 71942.8, 81917.8, 133471.3));

        liste.add(new Emission("Palau", "PLW", 0.0, 211.5, 214.8, 158.2));

        liste.add(new Emission("Papua New Guinea", "PNG", 2168.6, 2825.2, 5042.0, 5491.5));

        liste.add(new Emission("Poland", "POL", 350214.6, 295774.4, 313739.1, 279223.8));

        liste.add(new Emission("Pre-demographic dividend", "PRE", 187593355181.0, 262141263652.0, 336938477224.0, 469494036.0));

        liste.add(new Emission("Puerto Rico", "PRI", null, null, null, null));

        liste.add(new Emission("Korea, Dem. People's Rep.", "PRK", 119307.5, 71822.9, 51689.8, 52437.2));

        liste.add(new Emission("Portugal", "PRT", 41068.6, 61661.2, 50937.3, 38973.5));

        liste.add(new Emission("Paraguay", "PRY", 2072.2, 3524.3, 5043.3, 7575.7));

        liste.add(new Emission("West Bank and Gaza", "PSE", null, null, null, null));

        liste.add(new Emission("Pacific island small states", "PSS", 1262.58, 2045.78, 2473.7, 2178.0));

        liste.add(new Emission("Post-demographic dividend", "PST", 11301942.62, 12205401.5, 11794117.9, 9555830.37));

        liste.add(new Emission("French Polynesia", "PYF", null, null, null, null));

        liste.add(new Emission("Qatar", "QAT", 12543.4, 28666.2, 60912.1, 87578.3));

        liste.add(new Emission("Romania", "ROU", 172633.6, 89003.1, 77601.9, 68664.0));

        liste.add(new Emission("Russian Federation", "RUS", 2163533.1, 1563845.6, 1617827.5, 1618271.0));

        liste.add(new Emission("Rwanda", "RWA", 536.36, 660.52, 703.68, 1382.0));

        liste.add(new Emission("South Asia", "SAS", 641292.09, 1072998.26, 1878594.23, 2518434.77));

        liste.add(new Emission("Saudi Arabia", "SAU", 171403.3, 249654.8, 446131.5, 513555.8));

        liste.add(new Emission("Sudan", "SDN", 5365.69, 5690.74, 16427.4, 20796.1));

        liste.add(new Emission("Senegal", "SEN", 2326.3, 4063.7, 7026.2, 10680.2));

        liste.add(new Emission("Singapore", "SGP", 28970.0, 42117.5, 42413.6, 43705.0));

        liste.add(new Emission("Solomon Islands", "SLB", 152.9, 235.4, 342.8, 223.3));

        liste.add(new Emission("Sierra Leone", "SLE", 318.0, 333.3, 560.2, 1048.0));

        liste.add(new Emission("El Salvador", "SLV", 2383.3, 5631.6, 6539.2, 6376.3));

        liste.add(new Emission("San Marino", "SMR", null, null, null, null));

        liste.add(new Emission("Somalia", "SOM", 735.12, 486.6, 631.2, 660.4));

        liste.add(new Emission("Serbia", "SRB", 61906.5, 43985.4, 47103.9, 46324.3));

        liste.add(new Emission("Sub-Saharan Africa (excluding high income)", "SSA", 401651865181.0, 498327263652.0, 691744397224.0, 760269413.0));

        liste.add(new Emission("South Sudan", "SSD", 433885181.0, 459820652.0, 1313250224.0, 1742.7));

        liste.add(new Emission("Sub-Saharan Africa", "SSF", 401805065181.0, 498620963652.0, 692188097224.0, 760868113.0));

        liste.add(new Emission("Small states", "SST", 112880958354.0, 129409823393.0, 197456964.0, 216633197.0));

        liste.add(new Emission("Sao Tome and Principe", "STP", 46.5, 53.5, 102.8, 141.1));

        liste.add(new Emission("Suriname", "SUR", 1759988097.0, 1480.42, 1744.87, 2601.32));

        liste.add(new Emission("Slovak Republic", "SVK", 54811.8, 38072.2, 35432.2, 29035.8));

        liste.add(new Emission("Slovenia", "SVN", 13528.8, 14541.7, 15777.2, 12477.3));

        liste.add(new Emission("Sweden", "SWE", 53346.2, 53277.5, 47985.5, 33576.1));

        liste.add(new Emission("Eswatini", "SWZ", 1101.2, 1090.6, 849.2, 1147.7));

        liste.add(new Emission("Sint Maarten (Dutch part)", "SXM", null, null, null, null));

        liste.add(new Emission("Seychelles", "SYC", 153.2, 293.7, 443.7, 598.7));

        liste.add(new Emission("Syrian Arab Republic", "SYR", 32388.1, 44401.1, 61090.7, 25234.6));

        liste.add(new Emission("Turks and Caicos Islands", "TCA", null, null, null, null));

        liste.add(new Emission("Chad", "TCD", 388.9, 507.4, 1190.0, 1568.4));

        liste.add(new Emission("East Asia & Pacific (IDA & IBRD countries)", "TEA", 2546780356.0, 4069783.52, 9602646.0, 12608302.4));

        liste.add(new Emission("Europe & Central Asia (IDA & IBRD countries)", "TEC", 4381209140257.0, 2980028252393.0, 3251419.1, 3194229.5));

        liste.add(new Emission("Togo", "TGO", 977.6, 1269.0, 2630.1, 2415.1));

        liste.add(new Emission("Thailand", "THA", 88005.8, 168941.4, 240768.3, 265478.9));

        liste.add(new Emission("Tajikistan", "TJK", 11018.2, 2200.97, 2446.9, 9328.8));

        liste.add(new Emission("Turkmenistan", "TKM", 44646.3, 38507.5, 59175.1, 63655.0));

        liste.add(new Emission("Latin America & the Caribbean (IDA & IBRD countries)", "TLA", 851765808097.0, 1213210.92, 1539037.97, 1410200.16));

        liste.add(new Emission("Timor-Leste", "TLS", 0.0, 0.0, 244.1, 446.1));

        liste.add(new Emission("Middle East & North Africa (IDA & IBRD countries)", "TMN", 532994.2, 813164.0, 1231947.5, 1370939.0));

        liste.add(new Emission("Tonga", "TON", 84.1, 102.9, 117.7, 118.1));

        liste.add(new Emission("South Asia (IDA & IBRD)", "TSA", 641292.09, 1072998.26, 1878594.23, 2518434.77));

        liste.add(new Emission("Sub-Saharan Africa (IDA & IBRD countries)", "TSS", 401805065181.0, 498620963652.0, 692188097224.0, 760868113.0));

        liste.add(new Emission("Trinidad and Tobago", "TTO", 13152.4, 10204.5, 21443.0, 15420.0));

        liste.add(new Emission("Tunisia", "TUN", 14671.9, 21068.8, 28321.5, 29293.0));

        liste.add(new Emission("Turkiye", "TUR", 139197.9, 216396.5, 297814.0, 407406.2));

        liste.add(new Emission("Tuvalu", "TUV", 6.0, 7.0, 9.0, 6.0));

        liste.add(new Emission("Tanzania", "TZA", 1892.2, 2946.4, 6909.9, 14435.5));

        liste.add(new Emission("Uganda", "UGA", 785.735, 1297.6, 3332.0, 5674.6));

        liste.add(new Emission("Ukraine", "UKR", 688618.9, 297376.8, 268924.6, 165663.6));

        liste.add(new Emission("Upper middle income", "UMC", 6529915428354.0, 7522848982393.0, 13650211.56, 16383995507.0));

        liste.add(new Emission("Uruguay", "URY", 3848.7, 5458.5, 6283.8, 6514.3));

        liste.add(new Emission("United States", "USA", 4844517.4, 5775807.2, 5392109.4, 4320532.5));

        liste.add(new Emission("Uzbekistan", "UZB", 117767.7, 123804.5, 126240.5, 115577.8));

        liste.add(new Emission("St. Vincent and the Grenadines", "VCT", 82.6, 155.6, 233.6, 219.8));

        liste.add(new Emission("Venezuela, RB", "VEN", 101630.0, 131516.7, 164101.6, 72509.0));

        liste.add(new Emission("British Virgin Islands", "VGB", null, null, null, null));

        liste.add(new Emission("Virgin Islands (U.S.)", "VIR", null, null, null, null));

        liste.add(new Emission("Viet Nam", "VNM", 19327.9, 51207.7, 151413.5, 355323.1));

        liste.add(new Emission("Vanuatu", "VUT", 66.9, 89.3, 127.1, 121.3));

        liste.add(new Emission("World", "WLD", 21284042.79, 24280271.96, 32095872.94, 33566427.59));

        liste.add(new Emission("Samoa", "WSM", 89.0, 148.6, 192.4, 206.5));

        liste.add(new Emission("Kosovo", "XKX", null, null, null, null));

        liste.add(new Emission("Yemen, Rep.", "YEM", 6642.3, 15030.5, 25431.9, 9960.1));

        liste.add(new Emission("South Africa", "ZAF", 247614.7, 284463.3, 425548.4, 393241.6));

        liste.add(new Emission("Zambia", "ZMB", 2740.8, 1807.2, 2656.9, 7607.1));

        liste.add(new Emission("Zimbabwe", "ZWE", 16535.5, 13578.9, 9518.0, 8312.5));

}

    public List<Emission> getListe() {
        return liste;
    }
}