package lesson4.task4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ZooClub {
    private Map<Person, List<Pet>> map = new HashMap<>();

    public void addPersonToClub(Person person) {
        this.map.put(person ,new ArrayList<>());
    }
    public void addPetToPerson(Pet pet, Person person){
        List<Pet> pets = this.map.get(person);
        pets.add(pet);
    }
    public void removePetFromPerson(Pet pet,Person person){
        List<Pet> pets = this.map.get(person);
        Iterator<Pet> iterator = pets.iterator();
        while (iterator.hasNext()) {
            Pet next =  iterator.next();
            if (pet.equals(next)){
                iterator.remove();
            }
        }
    }

    public void removePetFromAllPerson(Pet pet) {
        Set<Map.Entry<Person, List<Pet>>> entries = this.map.entrySet();
        Iterator<Map.Entry<Person, List<Pet>>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Person, List<Pet>> personWithListOfPet =  iterator.next();
            List<Pet> pets = personWithListOfPet.getValue();
            Iterator<Pet> petsIterator = pets.iterator();
            while (petsIterator.hasNext()) {
                Pet next =  petsIterator.next();
                if (next.equals(pet)){
                    petsIterator.remove();
                }
            }
        }
    }
}
