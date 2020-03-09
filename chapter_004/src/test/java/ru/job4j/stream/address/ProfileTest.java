package ru.job4j.stream.address;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 1.0
 * @since 20.05.2019
 */
public class ProfileTest {

    /**
     * Test collect.
     */
    @Test
    public void whenListProfilesThenListAddresses() {
        Address client1 = new Address("Sochi", "Donskay", 17, 75);
        Address client2 = new Address("Toronto", "Mango Drive", 14, 14);
        Address client3 = new Address("Moscow", "Pushkina", 123, 45);
        Address client4 = new Address("Moscow", "Pushkina", 123, 45);
        Address client5 = new Address("Toronto", "Mango Drive", 14, 14);
        List<Profile> profiles = List.of(
                new Profile(client1),
                new Profile(client2),
                new Profile(client3),
                new Profile(client4),
                new Profile(client5));
        List<Address> expected = new Profile().collect(profiles);
        List<Address> result = List.of(
                client3,
                client1,
                client2);
        assertThat(result, is(expected));
    }
}