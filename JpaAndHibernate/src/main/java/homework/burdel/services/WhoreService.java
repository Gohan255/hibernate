package homework.burdel.services;

import homework.burdel.model.Whore;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class WhoreService {

    public List<Whore> findWhoresAged(List<Whore> list) {
        return Optional.ofNullable(list)
                .orElseGet(Collections::emptyList)
                .stream()
                .filter(w -> w.isHiv() == true)
                .filter(w -> w.getAge() < 18)
                .toList();
    }
}
