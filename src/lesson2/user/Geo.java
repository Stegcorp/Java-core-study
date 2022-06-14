package lesson2.user;

import lombok.*;

@ToString
@Getter
@Setter
@NoArgsConstructor
//@AllArgsConstructor
public class Geo {

    private String lat;
    private String lng;

    public Geo(String lat, String lng) {
        this.lat = lat;
        this.lng = lng;
    }

}
