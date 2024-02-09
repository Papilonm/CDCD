package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.*;

public class CommonMethods {

    public static WebDriver driver;

    public void openBrowser() {
        ChromeOptions co = new ChromeOptions();
        co.setHeadless(false);
        driver = new ChromeDriver(co);


    }

    public static String findWord(String text) {
        Set<String> ignoredWords = new HashSet<>(Arrays.asList("of", "the", "and", "a", "an"));

        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : text.toLowerCase().split("\\W+")) {
            if (!ignoredWords.contains(word)) {
                wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
            }
        }

        return Collections.max(wordCounts.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
