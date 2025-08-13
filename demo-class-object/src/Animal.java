import java.time.LocalDate;

public class Animal {
  // Attribute 要有 LocalDate , date of birth
  private LocalDate dateOfBirth;
  private String animalName;
  private String animalType;
  private String color;
  private int animalAge;

  // Setter
  public void setBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }
  public void setName(String animalName) {
    this.animalName = animalName;
  }
  public void setType(String animalType) {
    this.animalType = animalType;
  }
  public void setColor(String color) {
    this.color = color;
  }
  public void setAge(int animalAge) {
    this.animalAge = animalAge;
  }



  // Getter
  public LocalDate getBirth() {
    return this.dateOfBirth;
  }
  public String getName() {
    return this.animalName;
  }
  public String getType() {
    return this.animalType;
  }
  public String getColor() {
    return this.color;
  }
  public int getAge() {
    return this.animalAge;
  }
  public static void main(String[] args) {
    Animal a1 = new Animal();
    Animal a2 = new Animal();
    Animal a3 = new Animal();

    a1.setBirth(LocalDate.of(2025, 8, 14));
    System.out.println(a1.getBirth());
  }
}
