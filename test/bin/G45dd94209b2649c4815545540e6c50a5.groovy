 
		import org.apache.poi.ss.usermodel.Cell;
        import org.apache.poi.ss.usermodel.Row;
        import org.apache.poi.ss.usermodel.Sheet;
        import org.apache.poi.ss.usermodel.Workbook;
        import org.apache.poi.ss.util.CellReference;
        import org.apache.poi.xssf.streaming.SXSSFWorkbook;
        
        SXSSFWorkbook wb = new SXSSFWorkbook(100);
        Sheet sh = wb.createSheet();
        for(int rownum = 0; rownum < 200; rownum++){
            Row row = sh.createRow(rownum);
            for(int cellnum = 0; cellnum < 10; cellnum++){
                Cell cell = row.createCell(cellnum);
                cell.setCellValue(address);
            }
        }
        FileOutputStream out = new FileOutputStream("sxssf.xlsx");
        wb.write(out);
        out.close();
 
        wb.dispose();   
        
	