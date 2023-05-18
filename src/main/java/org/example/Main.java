package org.example;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

class ReadExcelExample {
    public static void main(String[] args) throws IOException {
        readExcel();
    }

    public static void readExcel() throws IOException {
        FileInputStream file = new FileInputStream("Number.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheetAt(0);
        //FormulaEvaluator formulaEvaluator = workbook.getCreationHelper().createFormulaEvaluator();
        for (Row row:sheet) {
            if (row.getCell(0) != null) {
                System.out.printf("%-10s",row.getCell(0));
            }
            if (row.getCell(1) != null) {
                System.out.printf("%-10s",row.getCell(1));
            }
            System.out.println("\n");
        }

        workbook.close();
        file.close();
    }
}
