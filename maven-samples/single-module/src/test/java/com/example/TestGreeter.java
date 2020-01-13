package com.example;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

public class TestGreeter {

  private Greeter greeter;

  @Before
  public void setup() {
    greeter = new Greeter();
  }

  @Test
  public void greetShouldIncludeTheOneBeingGreeted() {
    String someone = "World";

    assertThat(greeter.greet(someone), containsString(someone));
  }

  @Test
  public void greetShouldIncludeGreetingPhrase() {
    String someone = "World";

    assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length())));
  }

  @Test
  public void greetShouldIncludeGreetingMessage() {
    String someone = "World, Thanks you making me Happy";

    assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length())));
  }

  @Test
  public void customIdeonGreetingMessage() {
    String meh = "Ideon";

    assertThat(greeter.greet(meh).length(), is(greaterThan(meh.length())));
  }

  @Test
  public void customSimoneGreetingMessage() {
    String moh = "Simone";

    assertThat(greeter.greet(moh).length(), is(greaterThan(moh.length())));
  }
}
