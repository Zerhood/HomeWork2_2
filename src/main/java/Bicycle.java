import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Bicycle {
    private String modelName;
    private int wheelsCount;

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}