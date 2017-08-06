package com.sai.sri.siddhi.batch.xmltosql.processor;

import com.sai.sri.siddhi.batch.xmltosql.pojo.Tutorial;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.springframework.batch.item.ItemProcessor;

import java.io.File;
import java.io.IOException;


public class CustomItemProcessor implements ItemProcessor<Tutorial, Tutorial> {

    private Logger logger = LogManager.getLogger(getClass());

    private static void drawTable(PDPage page, PDPageContentStream contentStream, float y, float margin, String[][] content)
            throws IOException {
        final int rows = content.length;
        final int cols = content[0].length;

        final float rowHeight = 50;
        final float tableWidth = page.getMediaBox().getWidth()-(2*margin);
        final float tableHeight = rowHeight * rows;
        final float colWidth = tableWidth / (float) cols;
        final float cellMargin = 5f;

        // draw the rows
        float nexty = y;
        for (int i=0; i<=rows; i++) {
            contentStream.drawLine(margin, nexty, margin+tableWidth, nexty);
            nexty-=rowHeight;
        }

        //draw the columns
        float nextx = margin;
        for(int i=0; i<=cols; i++) {
            contentStream.drawLine(nextx, y, nextx, y-tableHeight);
            nextx += colWidth;
        }

        // now add the text
        contentStream.setFont(PDType1Font.HELVETICA_BOLD, 12);

        float textx = margin+cellMargin;
        float texty = y-15;
        for (int i=0; i<content.length; i++) {
            for(int j=0; j<content[i].length; j++) {
                String text = content[i][j];
                contentStream.beginText();
                contentStream.moveTextPositionByAmount(textx, texty);
                contentStream.drawString(text);
                contentStream.endText();
                textx += colWidth;
            }

            texty -= rowHeight;
            textx = margin + cellMargin;
        }
    }

    @Override
    public Tutorial process(Tutorial tutorial) throws Exception {
        logger.info("starting process, item: " + tutorial);
        /*PDDocument document = PDDocument.load(new File("C:\\Users\\New User\\Prasanth\\MyWksp\\SpringBatch-git\\xmlToMySqlDBBatchApp\\test.pdf"));
        PDPage page = new PDPage();
        document.addPage(page);
        PDPageContentStream contentStream = new PDPageContentStream(document, page);

        String[][] content = {{"Id", ""+tutorial.getTutorial_id()},
                                {"Title", tutorial.getTitle()},
                                {"Author", tutorial.getAuthor()},
                                {"Date", tutorial.getDate()}};

        drawTable(page, contentStream, 700, 100, content);

        contentStream.close();
        document.save("test.pdf");*/
        logger.info("done processing, item: " + tutorial);
        return tutorial;
    }


}
