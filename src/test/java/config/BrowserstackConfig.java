package config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/browserstack.properties")

public interface BrowserstackConfig extends Config {
    @Key("user")
    String browserstackUser();

    @Key("key")
    String browserstackKey();

    @Key("app")
    String app();

    @Key("device")
    String device();

    @Key("osVersion")
    String osVersion();

    @Key("project")
    String project();

    @Key("build")
    String build();

    @Key("name")
    String name();

    @Key("urlBrowserstack")
    String urlBrowserstack();
}
