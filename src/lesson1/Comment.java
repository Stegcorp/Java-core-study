package lesson1;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Comment {
//    та клас який описував би подіюні об'єкти
//    https://jsonplaceholder.typicode.com/comments/1
          private int postId;
          private int id;
          private String name;
          private String email;
          private String body;
}
