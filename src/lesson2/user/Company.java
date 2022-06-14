package lesson2.user;

import lombok.*;

@ToString
@Getter
@Setter
@NoArgsConstructor
//@AllArgsConstructor
public class Company {
    private String name;
    private String catchPhrase;
    private String bs;

    public Company(String name, String catchPhrase, String bs) {
        this.name = name;
        this.catchPhrase = catchPhrase;
        this.bs = bs;
    }
}
