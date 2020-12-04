import com.ancientprogramming.fixedformat4j.format.FixedFormatManager;
import com.ancientprogramming.fixedformat4j.format.impl.FixedFormatManagerImpl;

public class Generator {

    private static FixedFormatManager manager = new FixedFormatManagerImpl();

    public static void main(String[] args) {

        HeaderRecord headerRecord = new HeaderRecord();
        DetailRecord detailRecord = new DetailRecord();
        FooterRecord footerRecord = new FooterRecord();

        String headerExport = manager.export(headerRecord);
        System.out.println("header export only: " + headerExport);
        System.out.println("header export length: " + headerExport.length());

        String detailExport = manager.export(detailRecord);
        System.out.println("detail export only: " + detailExport);
        System.out.println("detail export length: " + detailExport.length());

        String footerExport = manager.export(footerRecord);
        System.out.println("footer export only: " + footerExport);
        System.out.println("footer export length: " + footerExport.length());

        /**
         * @todo: need to confirm that file layout is correct in that the header, detail, and footer record types all
         * have different lengths.... this doesn't make sense! why even use 1k+ spaces worth of padding in the first
         * place?
         *
         * My understanding of the document is that:
         *  header length = 1220 characters
         *  detail length = 1192 characters
         *  footer length = 1207 characters
         *
         */

        /*
        System.out.println("RecordType is: " + headerRecord.getRecordType());
        System.out.println("BatchNumber is: " + headerRecord.getBatchNumber());
        System.out.println("BatchDate is: " + headerRecord.getBatchDate());
        System.out.println("BatchTime is: " + headerRecord.getBatchTime());
        System.out.println("Padding LENGTH is: " + headerRecord.getPadding().length());

         String headerString = null;

         Header headerRecord = manager.load(Header.class, header.getRecordType());
         Header headerRecordTwo = manager.load(Header.class, "");

         String exportedString = manager.export(headerRecord);

         System.out.println("exported string is: " + exportedString);
         System.out.println("exported string length is: " + exportedString.length());

         String exportedStringTwo = manager.export(headerRecordTwo);

         System.out.println("exported string is: " + exportedStringTwo);
         System.out.println("exported string length is: " + exportedStringTwo.length());
         */

    }

}
