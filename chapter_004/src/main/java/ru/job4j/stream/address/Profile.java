package ru.job4j.stream.address;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Class Profile, .
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 1.0
 * @since 20.05.2019
 */
public class Profile {

    private Address address;

    public Profile(Address address) {
        this.address = address;
    }

    public Profile() {
    }

    public Address getAddress() {
        return address;
    }

    public List<Address> collect(List<Profile> profiles) {
        Comparator<Address> comparator = Comparator.comparing(Address::getCity);
        return profiles.stream().map(Profile::getAddress).sorted(comparator).distinct().collect(Collectors.toList());
    }
}
