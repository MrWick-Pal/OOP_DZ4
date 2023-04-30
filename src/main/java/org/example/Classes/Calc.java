package org.example.Classes;

import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class Calc<T> {
    public Double sum(List<? extends Number> number) {
        Double sum = 0.0;
        for (Number num : number) {
            sum += num.doubleValue();
        }
        return sum;
    }

    public Double multiply(List<? extends Number> numList) {
        double result = 1.0;
        for (Number num : numList) {
            result *= num.doubleValue();
        }
        return result;
    }

    public Double divide(List<? extends Number> numList) {
        double result = Double.parseDouble(numList.get(0).toString());
        for (int i = 0; i < numList.size() - 1; i++) {
            result = result / Double.parseDouble(numList.get(i + 1).toString());
        }
        return result;
    }

    public <T extends Number> List<String> digitBinary(List<Object> numList) {
        List<String> result = new ArrayList<>();
        for (Object num : numList) {
            int count = 0;
            if (Double.parseDouble(num.toString()) % 1 != 0) {
                StringBuilder convert = new StringBuilder("");
                convert.append("(" + num + ") ");
                double remains = (Double.parseDouble(num.toString()) - Math.floor((Double.parseDouble(num.toString()))));
                int whole = (int) (Double.parseDouble(num.toString()));
                convert.append(Integer.toBinaryString(whole));
                convert.append(".");
                while (remains >= 0) {
                    if (count == 11) {
                        break;
                    } else {
                        remains *= 2;
                        if (remains % 1 == 0) {
                            convert.append((int) remains);
                            break;
                        } else {
                            convert.append((int) remains);
                            remains -= Math.floor(remains);
                            count++;
                        }
                    }
                }
                result.add(convert.toString());
            } else {
                StringBuilder convert = new StringBuilder("");
                convert.append("(" + num + ") ");
                int whole = (int) (Double.parseDouble(num.toString()));
                convert.append(Integer.toBinaryString(whole));
                result.add(convert.toString());
            }
        }
        return result;
    }
}