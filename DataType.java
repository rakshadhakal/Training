public class DataType {
    public static void main (String[] args) {
        byte b;
       // System.out.println(" B is" +b);
       b=25;
       System.out.println("B is "+b);
       byte b1 = 0b01110011;
       byte b2 = -0x7c;
       System.out.println("Byte value are :"+ b +" ,"+b1+","+b2);
       short s= 32767;
       System.out.println("Short value is" +s);
       int i=2_147_232_323;
       System.out.println("Interger value is " +i);
       long l= 3248234752347123L;
       float f = 12.67f;
       System.out.println("Float value are " +f);
       double d= 12.67;
       System.out.println("Double:" +d);
       d=1234567.897652345262378484928327632637282883;
       System.out.println("Double value:" +d);
       d=234567890987654323545678909876543234567899876543234567890987654321.00;
       System.out.println("Double value: " +d);
       char c1= 'A';
       char c2= 65;
       char c3= '\u02c8';
       char c4= 2325;
       System.out.println("Character value :" +c1+","+c2+","+c3+","+c4);
       boolean bool=true;
       System.out.println("Boolean value is " +bool);
    }
}