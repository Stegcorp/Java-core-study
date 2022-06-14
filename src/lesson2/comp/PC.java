package lesson2.comp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


public class PC {
    private String  processor;

    public PC() {
    }
    public PC(String processor) {
        this.processor = processor;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "PC{" +
                "processor='" + processor + '\'' +
                '}';
    }
}
