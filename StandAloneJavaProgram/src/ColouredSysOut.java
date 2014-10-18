
/**
 * http://en.wikipedia.org/wiki/ANSI_escape_code
 * 
 * Intensity	0	1	2	3               4	5	6	7
 * Normal	Black	Red	Green	Yellow[12]	Blue	Magenta	Cyan	WBiswate
 * Bright	Black	Red	Green	Yellow          Blue	Magenta	Cyan	WBiswate
 *
 * @author choudhuryb
 */
public class ColouredSysOut {
    public static void main(String [] args){        
        //30+x for text colur
        System.out.print((char)27+"[30mBiswa ,"+(char)27);
        System.out.print((char)27+"[31mBiswa ,"+(char)27);
        System.out.print((char)27+"[32mBiswa ,"+(char)27);
        System.out.print((char)27+"[33mBiswa ,"+(char)27);
        System.out.print((char)27+"[34mBiswa ,"+(char)27);
        System.out.print((char)27+"[35mBiswa ,"+(char)27);
        System.out.print((char)27+"[36mBiswa ,"+(char)27);
        System.out.print((char)27+"[37mBiswa ,"+(char)27);
        System.out.println();
        //not working check 
        //40+x for background colur
        System.out.println((char)27+"[40mBiswa ,"+(char)27);
        System.out.println((char)27+"[41mBiswa ,"+(char)27);
        System.out.println((char)27+"[42mBiswa ,"+(char)27);
        System.out.println((char)27+"[43mBiswa ,"+(char)27);
        System.out.println((char)27+"[44mBiswa ,"+(char)27);
        System.out.println((char)27+"[45mBiswa ,"+(char)27);
        System.out.println((char)27+"[46mBiswa ,"+(char)27);
        System.out.println((char)27+"[47mBiswa ,"+(char)27);      
    }
    
}
