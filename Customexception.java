
class InvalidAgeException extends Exception{
    InvalidAgeException(String s){
    super(s);
    } }
    class TestCustomException1{
    static void validate(int age)throws InvalidAgeException{
    if(age<18)
    throw new InvalidAgeException("YES YES YES YES!!!!");
    else
    System.out.println("NO! NO! NO! NO!");
    }
    public static void main(String args[]){
    try{ 
    validate(13);
    }catch(Exception m){System.out.println("Exception occured: "+m);}
    
    System.out.println("The message is clear...");
    }
    }


