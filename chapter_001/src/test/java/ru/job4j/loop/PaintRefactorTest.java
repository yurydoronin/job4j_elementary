package ru.job4j.loop;

import org.junit.Test;
import java.util.StringJoiner;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 1.0
 * @since 07.02.2019
 */
public class PaintRefactorTest {

    /**
     * Test rightTrl.
     */
    @Test
    public void whenPyramid4Right() {
        PaintRefactor paint = new PaintRefactor();
        String result = paint.rightTrl(4);
        System.out.println(result);
        assertThat(result,
                is(new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                        .add("^   ")
                        .add("^^  ")
                        .add("^^^ ")
                        .add("^^^^")
                        .toString()
                )
        );
    }

    /**
     * Test leftTrl.
     */
    @Test
    public void whenPyramid4Left() {
        PaintRefactor paint = new PaintRefactor();
        String rst = paint.leftTrl(4);
        System.out.println(rst);
        assertThat(rst,
                is(new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                        .add("   ^")
                        .add("  ^^")
                        .add(" ^^^")
                        .add("^^^^")
                        .toString()
                )
        );
    }

    /**
     * Test pyramid.
     */
    @Test
    public void whenPyramidAsAWhole() {
        PaintRefactor paint = new PaintRefactor();
        String result = paint.pyramid(4);
        System.out.println(result);
        assertThat(result,
                is(new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                        .add("   ^   ")
                        .add("  ^^^  ")
                        .add(" ^^^^^ ")
                        .add("^^^^^^^")
                        .toString()
                )
        );
    }
}