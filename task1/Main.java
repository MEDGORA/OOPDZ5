public class Main {
    
public static void main(String[] args) {
        
        CalculateComplex calcComp1 = new CalculateComplex(15, 37);
        calcComp1.setW(2.0);
        calcComp1.setZ(3.3);

        System.out.println("sum = " + calcComp1.sum());
        System.out.println("diff = " + calcComp1.diff());
        System.out.println("mult = " + calcComp1.mult());
        System.out.println("div = " + calcComp1.div());

        SaveComplexResult saveComlex = new SaveComplexResult();
        saveComlex.SaveResultComplex(calcComp1, calcComp1.sum());

        CalculateRacional calcRaci1 = new CalculateRacional(3, 4);
        calcRaci1.setW(5);
        calcRaci1.setZ(6);

        System.out.println("sum = " + calcRaci1.sum());
        System.out.println("diff = " + calcRaci1.diff());
        System.out.println("mult = " + calcRaci1.mult());
        System.out.println("div = " + calcRaci1.div());

        SaveRacionalResult saveRacional = new SaveRacionalResult();
        saveRacional.SaveResultRacional(calcRaci1, calcRaci1.sum());
    }
}
