package in.jord.tacnode.parsers.primitives;

import in.jord.tacnode.parsers.ArgumentParser;
import in.jord.tacnode.util.CommonSuggestions;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Jordin on 8/9/2017.
 * Jordin is still best hacker.
 */
public class BooleanParser implements ArgumentParser<Boolean> {
    @Override
    public Boolean parse(Iterator<String> arguments) {
        return CommonSuggestions.ACCEPTABLE_TRUE_VALUES.contains(arguments.next().toLowerCase());
    }

    @Override
    public List<String> provideSuggestions() {
        return CommonSuggestions.COMMON_BOOLEAN_VALUES;
    }
}
