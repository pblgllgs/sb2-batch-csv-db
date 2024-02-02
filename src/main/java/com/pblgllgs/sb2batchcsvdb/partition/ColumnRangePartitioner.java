package com.pblgllgs.sb2batchcsvdb.partition;
/*
 *
 * @author pblgl
 * Created on 02-02-2024
 *
 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.partition.support.Partitioner;
import org.springframework.batch.item.ExecutionContext;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class ColumnRangePartitioner implements Partitioner {
    @Override
    public Map<String, ExecutionContext> partition(int gridSize) {//2
        int min = 1;
        int max = 1000;
        int targetSize = (max - min) / gridSize + 1;//500
        log.info("targetSize : " + targetSize);
        Map<String, ExecutionContext> result = new HashMap<>();

        int number = 0;
        int start = min;
        int end = start + targetSize - 1;
        //1 to 500
        // 501 to 1000
        while (start <= max) {
            ExecutionContext value = new ExecutionContext();
            result.put("partition" + number, value);

            if (end >= max) {
                end = max;
            }
            value.putInt("minValue", start);
            value.putInt("maxValue", end);
            start += targetSize;
            end += targetSize;
            number++;
        }
        log.info("partition result:" + result.toString());
        return result;
    }
}
