class SqueakyClean {
    static String clean(String identifier) {
        identifier = identifier.replace(' ', '_');
        identifier = kebabToCamel(identifier);
        identifier = leetSpeakToNormal(identifier);
        identifier = omitNotLetters(identifier);

        return identifier;
    }

    private static String kebabToCamel(String identifier) {
        String[] strings = null;

        if(identifier.contains("-")) {
            strings = identifier.split("-");
            strings[1] = strings[1].substring(0,1).toUpperCase() + strings[1].substring(1);

            return strings[0] + strings[1];
        }

        return identifier;
    }

    private static String leetSpeakToNormal(String identifier) {
        return identifier
                .replace('4', 'a')
                .replace('3', 'e')
                .replace('0', 'o')
                .replace('1', 'l')
                .replace('7', 't');
    }

    private static String omitNotLetters(String identifier) {
        for(int i = 0; i < identifier.length(); i ++){
            char aux = identifier.charAt(i);

            if(!Character.isLetter(aux) && aux != '_'){
                identifier = identifier.replace(aux, ' ');
            }
        }

        return identifier.replace(" ", "");
    }
}
