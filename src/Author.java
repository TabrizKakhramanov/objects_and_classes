import java.util.Objects;

public class Author {
    private String firstName;
    private String secondName;

    public Author (String firstName, String secondName){
        this.firstName=firstName;
        this.secondName=secondName;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getSecondName(){
        return this.secondName;
    }

    @Override
    public String toString() {
        return getFirstName()+" "+getSecondName();
    }

    @Override
    public boolean equals(Object obj) {
        if (this.getClass()!=obj.getClass()){
            return false;
        }
        Author chek = (Author) obj;
        return (firstName.equals(chek.firstName)&&secondName.equals(chek.secondName));
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(firstName,secondName);
    }

}
