 
				//ON MY LOCAL MACHINE IT WORKS ONLY IN THIS WAY
				void getPuttyText() {
					sendKeys("{ALT}")
					for (int i = 0; i < 12; i ++) {
						sendKeys("{DOWN}")
					}
					sendKeys("{ENTER}")
				}			
			
				open("C:/Program Files/PuTTY/putty.exe -ssh traning@traning-ssh.workfusion.com -pw dEFgEmzL")
				sleep(5000)
				switchTo().window("[CLASS:PuTTY]")
				mainCommand = "ssh-keygen -t rsa -C \"test.yauheni.shyroki@gmail.com\"{ENTER}"
				fileName = "yauheni_shyroki{ENTER}"
				passPhrase = "workfusion{ENTER}"
				printPrivate = "cat yauheni_shyroki{ENTER}"
				printPublic = "cat yauheni_shyroki.pub{ENTER}"
				sendKeys(mainCommand)
				sendKeys(fileName)
				getPuttyText()
				if (clipboardText().contains("Overwrite")) {
					sendKeys("y{ENTER}")
				}
				sendKeys(passPhrase)
				sendKeys(passPhrase)
				sendKeys(printPrivate)
				sendKeys(printPublic)
				
				getPuttyText()
				data = clipboardText()
				
				privateKey = data.substring(data.indexOf("-----BEGIN RSA PRIVATE KEY-----"), data.indexOf("-----END RSA PRIVATE KEY-----")).replace("-----BEGIN RSA PRIVATE KEY-----", "").trim()
				publicKey = data.substring(data.indexOf("cat yauheni_shyroki.pub")).replace("cat yauheni_shyroki.pub", "").replace("traning@ip-172-31-31-195:~\$", "").trim()
				
			