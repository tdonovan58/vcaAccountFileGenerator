import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;

import java.sql.Time;
import java.util.Date;

@Record
public class HeaderRecord {

    private String recordType;
    private String batchNumber;
    private String batchDate;
    private String batchTime;
    private String padding;
    private int maxIndex;
    private String SPACE = " "; // @todo: this might not be needed

    @Field(offset = 1, length = 3)
    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    @Field(offset = 4, length = 6)
    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    @Field(offset = 10, length = 8)
    public String getBatchDate() {
        return batchDate;
    }

    public void setBatchDate(String batchDate) {
        this.batchDate = batchDate;
    }

    @Field(offset = 18, length = 8)
    public String getBatchTime() {
        return batchTime;
    }

    public void setBatchTime(String batchTime) {
        this.batchTime = batchTime;
    }

    @Field(offset = 26, length = 1195)
    public String getPadding() {
        return padding;
    }

    public void setPadding(String padding) {
        this.padding = padding;
    }

    public int getMaxIndex() {
        return maxIndex;
    }

    public void setMaxIndex(int maxIndex) {
        this.maxIndex = maxIndex;
    }

    public HeaderRecord(){

        maxIndex = 1120;

        recordType = "HDR";
        batchNumber = "000001";
        batchDate = DateTimeUtils.INTEGER_DATE.format(new Date());
        batchTime = DateTimeUtils.INTEGER_TIME.format(new Date());

        // padding starts at char 26 and ends at char 1195, so index 25 thru 1194
        StringBuffer paddingStringBuffer = new StringBuffer();
        for(int i = 26; i < maxIndex; i++){
            paddingStringBuffer.append(SPACE);
        }
        padding = String.valueOf(paddingStringBuffer);

    }


}
