package kr.co.kokono.recipe.chap02.r2_6;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;


import org.springframework.core.io.Resource;

import javax.annotation.PostConstruct;

public class BannerLoader {

    private Resource banner;

    public void setBanner(Resource banner) {
        this.banner = banner;
    }


    @PostConstruct
    public void showBanner() throws IOException {
        Files.lines(Paths.get(banner.getURI()), Charset.forName("UTF-8"))
             .forEachOrdered(System.out::println);
    }
}
