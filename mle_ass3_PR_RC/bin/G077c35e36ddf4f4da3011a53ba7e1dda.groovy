
				import java.text.DecimalFormat;
				println gold.get("id").toString() + " ---- GOLD"
				for (value in extracted) {
					if(value.get("id").toString().equals(gold.get("id").toString())) {
						println value.toString() + " ---- EXTR"
						if (!value.get("invoice_amount").toString().equals("")) {
							println "NOT EMPTY"
							Extr++
							
							try {
								DecimalFormat formatter = DecimalFormat.getInstance(Locale.US);
								formatter.setMinimumFractionDigits(2)
								gold_amount = gold_invoice_amount.get(0).getWrappedObject().toString()
								gold_amount = gold_amount.substring(gold_amount.indexOf("data-value=\"") + 12, gold_amount.indexOf("\">"))
								println gold_amount + " ---- GOLD AMOUNT"
								extracted_amount = value.get("invoice_amount").toString()
								extracted_amount_str = formatter.format(Double.parseDouble(extracted_amount.replace(",", ".")))
								println extracted_amount_str + " ---- EXTR AMOUNT"
								if (extracted_amount_str.equals(gold_amount)) {
									println "GOOD"
									TP++
								}
								
							} catch (NumberFormatException e) {
							
							}
							
						} else {
							println "EMPTY"
						}
					}
				} 
			