/* 
 * Copyright (C) 2020 mon_mode   0mon.mode@gmail.com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package monmo.org.main;

import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import static monmo.org.entities.MyQr.createQR;
import monmo.org.utilities.UtilesEntrada;

/**
 *
 * @author nv3ob61
 */
public class Main {

  /**
   * @param args the command line arguments
   * @throws com.google.zxing.WriterException
   * @throws java.io.IOException
   */
  public static void main(String[] args) throws WriterException, IOException {
    // The data that the QR code will contain
    String data = "https://github.com/nv3ob61";
    
    //set the filename
    String path = UtilesEntrada.leerTexto("File name without extension: ") + ".png";

    // Encoding charset
    String charset = "UTF-8";

    Map<EncodeHintType, ErrorCorrectionLevel> hashMap
            = new HashMap<>();

    hashMap.put(EncodeHintType.ERROR_CORRECTION,
            ErrorCorrectionLevel.L);

    // Create the QR code and save
    createQR(data, path, charset, hashMap, 200, 200);
    System.out.println("QR Code Generated!!! ");
  }

}
