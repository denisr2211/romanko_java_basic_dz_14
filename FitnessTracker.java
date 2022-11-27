import java.util.ArrayList;
import java.util.StringTokenizer;

public class FitnessTracker {
    private final String name;
    private final String dateOfBirth;
    private final String email;
    private final String number;
    private final int age;
    //changeable
    private String surname;
    private int weight;
    private String bloodPressure;
    private int stepsPerDay;


    public static void accountInfo(Persons person){
        System.out.printf("name: %s\nsurname: %s\nage: %d\ndate of birth: %s\nemail: %s\nnumber: %s\nweigh: %s\nblood pressure: %s\nsteps per day: %s\n\n",
                person.getName(), person.getSurname(), person.getAge(), person.getDateOfBirth(), person.getEmail(), person.getNumber(), person.getWeight(),
                person.getBloodPressure(), person.getStepsPerDay());
    }


    FitnessTracker(String name,String surname, String dateOfBirth, String email, String number,int weight, String bloodPressure, int stepsPerDay){
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.number = number;
        this.weight = weight;
        this.bloodPressure = bloodPressure;
        this.stepsPerDay = stepsPerDay;
        ArrayList<String> tmp = new ArrayList<>();
        StringTokenizer tokenizer = new StringTokenizer(dateOfBirth, "/");
        while(tokenizer.hasMoreTokens()){
            tmp.add(tokenizer.nextToken());
        }
        this.age = 2022 - Integer.parseInt(tmp.get(2));


    }

    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public String getDateOfBirth(){
        return dateOfBirth;
    }
    public String getEmail(){
        return email;
    }
    public String getNumber(){
        return number;
    }
    public int getWeight(){
        return weight;
    }
    public  String getBloodPressure(){
        return bloodPressure;
    }
    public int getStepsPerDay(){
        return stepsPerDay;
    }
    public int getAge(){ return age; }

// changeable parameters

    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public void setBloodPressure(String bloodPressure){
        this.bloodPressure = bloodPressure;
    }
    public void setStepsPerDay(int stepsPerDay){
        this.stepsPerDay = stepsPerDay;
    }
}
