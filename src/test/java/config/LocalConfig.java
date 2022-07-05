package config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/local.properties")

public interface LocalConfig extends Config {

    @Key("appActivity")
    String appActivity();

    @Key("appPackage")
    String appPackage();

    @Key("platformVersion")
    String platformVersion();

    @Key("deviceName")
    String deviceName();

    @Key("platformName")
    String platformName();

    @Key("urlLocal")
    String urlLocal();
}
