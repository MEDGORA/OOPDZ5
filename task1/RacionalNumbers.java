public class RacionalNumbers extends ValuesNumbers{
    
    public RacionalNumbers(Double x, Double y){
        super.x = x;
        super.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this){
            return true;
        }
        if(obj == null || obj.getClass() != this.getClass()){
            return false;
        }
        RacionalNumbers raciNum = (RacionalNumbers) obj;
        return super.x == raciNum.x && super.y == raciNum.y;
    }

    @Override
    public String toString(){
        return "CalculateRacional{" + "x = " + x + ", y = " + y + "}";
    }
}
