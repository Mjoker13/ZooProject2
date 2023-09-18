package Domain.GameDomain;

import Domain.AnimalDomain.Animal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Room {
    private String name;
    private List<Item> itemsPresentInRoom;
    private List<Animal> animals;
}
