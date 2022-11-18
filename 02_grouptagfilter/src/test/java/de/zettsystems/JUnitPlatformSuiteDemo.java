package de.zettsystems;

import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName("This is a suite")
@SelectPackages({"de.zettsystems.fizzbuzz", "de.zettsystems.legacy", "de.zettsystems.grouped"})
@SelectClasses({
        MoreTest.class
})
@ExcludeTags("buzz")
public class JUnitPlatformSuiteDemo {
}
