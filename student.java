package BMITest;

public class student {
	private String id;
    private String name;
    private double height;  //身高
    private double weight;   //体重

    public student() {
        System.out.println("输出BMI指数");
    }

    public student(String id, String name, double height, double weight) {
        this.id = id;
    	this.name = name;
        this.height =height;
        this.weight = weight;
    }

    public String getID() {
    	return id;
    }
    
    public void setID(String id) {
    	this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void getBMI() {
        double BMI = weight/(height * height);
        if(BMI<= 18.4){
            System.out.println((String.format("%.2f", BMI))+ "   偏瘦，需要适当增重");
        }else if(18.5 <= BMI && BMI <=23.9){
            System.out.println((String.format("%.2f", BMI)) + "   你的BMI指数在正常范围内！");
        }else if(24 <= BMI && BMI <= 27.9){
            System.out.println( (String.format("%.2f", BMI)) + "   过胖，必须减肥！");
        }else{
            System.out.println( (String.format("%.2f", BMI)) + "   超重，需要减肥！");
        }
    }
}

