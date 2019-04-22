package edu.dmacc.codedsm.mvcfizzbuzz;

import java.util.HashMap;
import java.util.Map;

public class FizzBuzzMapRepository implements MapRepository {

    private Map<Integer, Result> storage = new HashMap<>();

    @Override
    public void save(Result result) {
        storage.put(1, result);
    }
}
