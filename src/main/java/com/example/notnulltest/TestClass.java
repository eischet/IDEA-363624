package com.example.notnulltest;

import org.jetbrains.annotations.NotNull;

public class TestClass {

    public static void foo() {
        final @NotNull String bar = "bar";
        var baz = new Baz(bar);


        /* Alt-Enter on Baz and then selecting "Create Class 'Baz'" generates the following code:

        package com.example.notnulltest;

        import org.jetbrains.annotations.NotNull;

        public class Baz {
            public Baz(final @NotNull @NotNull String bar) {
            }
        }

        Which cannot compile, because you cannot stack @NotNull.

         */

        // I'm getting the same issue with: Baz baz = new Baz(bar);

        // creating methods works fine / as expected

    }


}
