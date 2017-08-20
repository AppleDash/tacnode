package me.jordin.tacnode.parsers.primitives;

import me.jordin.tacnode.exceptions.InvalidTypeException;
import me.jordin.tacnode.parsers.ArgumentParser;
import me.jordin.tacnode.util.CommonSuggestions;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Jordin on 8/9/2017.
 * Jordin is still best hacker.
 */
public class ByteParser implements ArgumentParser<Byte> {
    @Override
    public Byte parse(Iterator<String> arguments) throws InvalidTypeException {
        try {
            return Byte.valueOf(arguments.next());
        } catch (NumberFormatException numberFormatException) {
            throw new InvalidTypeException("byte", numberFormatException);
        }
    }

    @Override
    public List<String> provideSuggestions() {
        return CommonSuggestions.ZERO;
    }
}