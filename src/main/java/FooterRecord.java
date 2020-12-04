import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;

@Record
public class FooterRecord {

    private String recordType;
    private int recordCount;
    private String padding;

    @Field(offset = 1, length = 3)
    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    @Field(offset = 4, length = 9)
    public int getRecordCount() {
        return recordCount;
    }

    public void setRecordCount(int recordCount) {
        this.recordCount = recordCount;
    }

    @Field(offset = 13, length = 1195)
    public String getPadding() {
        return padding;
    }

    public void setPadding(String padding) {
        this.padding = padding;
    }

    public FooterRecord(){
        recordType = "TRL";
        // @todo: dynamically calculate recordCount while DetailRecord items are being written
        recordCount = 10;
        padding = "";

    }

}
