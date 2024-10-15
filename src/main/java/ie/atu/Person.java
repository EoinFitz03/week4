package ie.atu;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Person {
    @NotBlank(message = "Name cannot be blank")
    private String name;

    @Email(message = "Invalid email address")
    private String email;

    @Min(value = 0, message = "Age must be greater than or equal to 0 ")
    private int age;

    @NotBlank( message = "title cannot be blank")
    private String title;

    @NotBlank( message = "position cannot be blank")
    private String position;

    @NotBlank(message = "Eircode cannot be blank")
    private String department;

}
