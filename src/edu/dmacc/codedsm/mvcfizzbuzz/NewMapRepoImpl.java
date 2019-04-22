package edu.dmacc.codedsm.mvcfizzbuzz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class NewMapRepoImpl implements MapRepository {

    private Map<Integer, Result> storage = new HashMap<>();
    private File file = new File("fizzbuzz_result.txt");
    private PrintWriter resultSaver;

    @Override
    public void save(Result result) {
        try {
            resultSaver = new PrintWriter(file);
            resultSaver.print(result);
       } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (resultSaver != null){
                resultSaver.close();
            }
        }
        storage.put(1, result);
    }
}
