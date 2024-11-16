public class BooleanCalculator {

    public void calculate(String val1, String val2, String operation) throws CustomException {
        
        Object parsedVal1 = parseValue(val1);
        Object parsedVal2 = null;

        if (operation.equalsIgnoreCase("not")) {
            if (parsedVal1 == null) {
                throw new CustomException("Missing value for 'not' operation");
            }
            not(parsedVal1);  
            return; 
        }
    
        if (parsedVal1 == null || val2 == null) {
            throw new CustomException("Missing one or both operands");
        }
    
        parsedVal2 = parseValue(val2);
        if (parsedVal2 == null) {
            throw new CustomException("Missing operation");
        }
    

        switch (operation.toLowerCase()) {
            case "or":
                or(parsedVal1, parsedVal2);
                break;
            case "and":
                and(parsedVal1, parsedVal2);
                break;
            case "xor":
                xor(parsedVal1, parsedVal2);
                break;
            case "nand":
                nand(parsedVal1, parsedVal2);
                break;
            case "nor":
                nor(parsedVal1, parsedVal2);
                break;
            case "xnor":
                xnor(parsedVal1, parsedVal2);
                break;
            default:
                System.out.println("Can't execute unknown operation"  + operation);
        }
    }

    private Object parseValue(String value) {
        if (value.equalsIgnoreCase("true") || value.equalsIgnoreCase("false")) {
            return Boolean.parseBoolean(value);
        }

        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e1) {
            
        }

        if (value.length() == 1) {
            return value.charAt(0);
        }

        return null;
    }

    private void or(Object val1, Object val2) {
        if (val1 instanceof Boolean && val2 instanceof Boolean) {
            System.out.println((Boolean) val1 || (Boolean) val2);
        } else if (val1 instanceof Integer && val2 instanceof Integer) {
            System.out.println((Integer) val1 | (Integer) val2);
        } else if (val1 instanceof Character && val2 instanceof Character) {
            System.out.println((char) ((Character) val1 | (Character) val2));
        } else {
            System.out.println("Option unavailable");
        }
    }

    private void and(Object val1, Object val2) {
        if (val1 instanceof Boolean && val2 instanceof Boolean) {
            System.out.println((Boolean) val1 && (Boolean) val2);
        } else if (val1 instanceof Integer && val2 instanceof Integer) {
            System.out.println((Integer) val1 & (Integer) val2);
        } else if (val1 instanceof Character && val2 instanceof Character) {
            System.out.println((char) ((Character) val1 & (Character) val2));
        } else {
            System.out.println("Option unavailable");
        }
    }

    private void xor(Object val1, Object val2) {
        if (val1 instanceof Boolean && val2 instanceof Boolean) {
            System.out.println((Boolean) val1 ^ (Boolean) val2);
        } else if (val1 instanceof Integer && val2 instanceof Integer) {
            System.out.println((Integer) val1 ^ (Integer) val2);
        } else if (val1 instanceof Character && val2 instanceof Character) {
            System.out.println((char) ((Character) val1 ^ (Character) val2));
        } else {
            System.out.println("Option unavailable");
        }
    }

    private void not(Object val1) {
        if (val1 instanceof Boolean) {
            System.out.println(!(Boolean) val1);
        } else if (val1 instanceof Integer) {
            System.out.println(~(Integer) val1);
        } else if (val1 instanceof Character) {
            System.out.println((char) ~(Character) val1);
        } else {
            System.out.println("Option unavailable");
        }
    }

    private void nand(Object val1, Object val2) {
        if (val1 instanceof Boolean && val2 instanceof Boolean) {
            System.out.println(!(Boolean) val1 && (Boolean) val2);
        } else if (val1 instanceof Integer && val2 instanceof Integer) {
            System.out.println(~((Integer) val1 & (Integer) val2));
        } else if (val1 instanceof Character && val2 instanceof Character) {
            System.out.println((char) ~(Character) val1 & (Character) val2);
        } else {
            System.out.println("Option unavailable");
        }
    }

    private void nor(Object val1, Object val2) {
        if (val1 instanceof Boolean && val2 instanceof Boolean) {
            System.out.println(!(Boolean) val1 || (Boolean) val2);
        } else if (val1 instanceof Integer && val2 instanceof Integer) {
            System.out.println(~((Integer) val1 | (Integer) val2));
        } else if (val1 instanceof Character && val2 instanceof Character) {
            System.out.println((char) ~(Character) val1 | (Character) val2);
        } else {
            System.out.println("Option unavailable");
        }
    }

    private void xnor(Object val1, Object val2) {
        if (val1 instanceof Boolean && val2 instanceof Boolean) {
            System.out.println(!(Boolean) val1 ^ (Boolean) val2);
        } else if (val1 instanceof Integer && val2 instanceof Integer) {
            System.out.println(~((Integer) val1 ^ (Integer) val2));
        } else if (val1 instanceof Character && val2 instanceof Character) {
            System.out.println((char) ~(Character) val1 ^ (Character) val2);
        } else {
            System.out.println("Option unavailable");
        }
    }
}
