package parsers;

import java.util.HashMap;
import java.util.Map;

public class ParserRegistry {

    private static final Map<String, FileParser> parserMap = new HashMap<>();

    static {
        parserMap.put("pdf", new PdfFileParser());
        parserMap.put("docx", new DocxFileParser());
        parserMap.put("html", new HtmlFileParser());
    }

    public static FileParser getParser(String extension) {
        return parserMap.get(extension);
    }
}
