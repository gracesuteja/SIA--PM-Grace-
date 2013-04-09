<%-- 
    Document   : ambil_input
    Created on : Apr 8, 2013, 7:27:37 AM
    Author     : DonnyEff
--%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
        <title>Sistem Informasi Akademik</title>
        <link href="css.css" rel="stylesheet" type="text/css" />
        <style type="text/css">
            <!--
            .style1 {color: #604023}
            -->
        </style>
    </head>

    <body>
        <table width="762" border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#FDF7EB">
            <tr>
                <td valign="top"><table width="744" border="0" align="center" cellpadding="0" cellspacing="0">
                        <tr>
                            <td height="120"><table width="700" border="0" align="center" cellpadding="0" cellspacing="0">
                                    <tr>
                                        <td width="377" valign="top"><img src="images/index_05.gif" width="314" height="60" alt="" /></td>
                                        <td width="323">
                                        </td>
                                    </tr>
                                </table></td>
                        </tr>
                        <tr>
                            <td valign="top"><table width="744" border="0" cellspacing="0" cellpadding="0">
                                    <tr>
                                        <td width="378" valign="top"><img src="images/index_15.gif" width="378" height="213" alt="" /></td>
                                        <td width="366" valign="top"><table width="366" border="0" cellspacing="0" cellpadding="0">
                                                <tr>
                                                    <td width="366" height="61" valign="top"><img src="images/index_16.gif" width="366" height="61" alt="" /></td>
                                                </tr>
                                                <tr>
                                                    <td height="152" valign="top" bgcolor="#3C2D21" class="welcome" style="padding-left:24px; padding-right:25px; "><br />
                                                        Institut Teknologi Harapan Bangsa.<br />
                                                        <br />
                                                        Bertumbuh 10 tahun.<br />
                                                    </td>
                                                </tr>
                                            </table></td>
                                    </tr>
                                </table></td>
                        </tr>

                        <tr>
                            <td valign="top"><table width="744" border="0" cellspacing="0" cellpadding="0">
                                    <tr>
                                        <td width="31" height="36"><img src="images/index_26.gif" width="31" height="36" alt="" /></td>
                                        <td width="702" height="36" style="background-image:url(images/index_28.gif); background-repeat:repeat-x;"><pre class="menu">Selamat datang, Anda user (User yang login)</pre></td>
                                        <td width="11" height="36" align="right"><img src="images/index_31.gif" width="11" height="36" alt="" /></td>
                                    </tr>
                                </table></td>
                        </tr>

                        <tr>
                            <td valign="top" style="padding-top:8px;"><table width="744" border="0" cellpadding="0" cellspacing="0" bgcolor="#F0E2D0">
                                    <tr>
                                        <td width="318" valign="top"><table width="318" border="0" cellspacing="0" cellpadding="0">
                                                <tr>
                                                    <td><img src="images/index_36.gif" width="318" height="6" alt="" /></td>
                                                </tr>
                                                <tr>
                                                    <td valign="top" bgcolor="#F0E2D0" style="padding-top:15px; padding-bottom:15px;"><table width="295" border="0" align="center" cellpadding="0" cellspacing="0">

                                                            <form id="form_ambil" name="form_ambil" method="post" action="">

                                                                <tr>
                                                                    <td height="35" colspan="3" valign="top" class="heading" style="padding-top:8px; color:#0066FF;"><span class="style2"><strong>AMBIL BAHAN KULIAH:</strong></span></td>
                                                                </tr>
                                                                <tr>
                                                                    <td width="34%" class="body">NIM:</td>
                                                                    <td width="66%" colspan="2"><input type="text" name="ambil_nim" style="width:180px; height:13px;" /></td>
                                                                </tr>
                                                                <tr>
                                                                    <td class="body">KODE MK:</td>
                                                                    <td colspan="2"><input type="text" name="ambil_kodemk" style="width:180px; height:13px;" /></td>
                                                                </tr>
                                                                <tr>
                                                                    <td class="body">ID_DEPT:</td>
                                                                    <td colspan="2"><input type="text" name="ambil_iddept" style="width:180px; height:13px;" /></td>
                                                                </tr>
                                                                <tr>
                                                                    <td class="body">ID_PERIODIK:</td>
                                                                    <td colspan="2"><input type="text" name="ambil_periodik" style="width:180px; height:13px;" /></td>
                                                                </tr>
                                                                <tr>
                                                                    <td class="body">KELAS:</td>
                                                                    <td colspan="2"><input type="text" name="ambil_kelas" style="width:180px; height:13px;" /></td>
                                                                </tr>
                                                                <tr>
                                                                    <td class="body">SEMESTER:</td>
                                                                    <td colspan="2"><input type="text" name="ambil_semester" style="width:180px; height:13px;" /></td>
                                                                </tr>
                                                                <tr>
                                                                    <td class="body">NILAI 1:</td>
                                                                    <td colspan="2"><input type="text" name="ambil_nilai1" style="width:180px; height:13px;" /></td>
                                                                </tr>
                                                                <tr>
                                                                    <td class="body">NILAI 2:</td>
                                                                    <td colspan="2"><input type="text" name="ambil_nilai2" style="width:180px; height:13px;" /></td>
                                                                </tr>
                                                                <tr>
                                                                    <td class="body">NILAI 3:</td>
                                                                    <td colspan="2"><input type="text" name="ambil_nilai3" style="width:180px; height:13px;" /></td>
                                                                </tr>
                                                                <tr>
                                                                    <td class="body">NILAI 4:</td>
                                                                    <td colspan="2"><input type="text" name="ambil_nilai4" style="width:180px; height:13px;" /></td>
                                                                </tr>
                                                                <tr>
                                                                    <td class="body">NILAI 5:</td>
                                                                    <td colspan="2"><input type="text" name="ambil_nilai5" style="width:180px; height:13px;" /></td>
                                                                </tr>
                                                                <tr>
                                                                    <td>&nbsp;</td>
                                                                    <td colspan="2">
                                                                        <tr>
                                                                            <td width="38%"><input type="submit" name="subButton" /></td>
                                                                            <td width="62%"><input type="reset" name="resetButton" /></td>
                                                                        </tr>
                                                                    </td>
                                                                </tr>

                                                            </form>


                                                        </table></td>
                                                </tr>
                                            </table></td>

                                        <td width="223" valign="top" bgcolor="#FFFFFF" style="padding-top:20px;"><table width="202" border="0" align="center" cellpadding="0" cellspacing="0">
                                                <tr>
                                                    <td valign="top" style="padding-bottom:14px;"><img src="images/index_41.gif" width="194" height="27" alt="" /></td>
                                                </tr>
                                                <tr>
                                                    <td valign="top" class="body" style="padding-left:12px; padding-right:12px; line-height:16px;"> 
                                                        <a href="#">Absensi</a></td>
                                                </tr>
                                                <tr>
                                                    <td valign="top" class="body" style="padding-left:12px; padding-right:12px; line-height:16px;"> 
                                                        <a href="#">Ajar Mata Kuliah</a></td>
                                                </tr>
                                                <tr>
                                                    <td valign="top" class="body" style="padding-left:12px; padding-right:12px; line-height:16px;"> 
                                                        <a href="#">Ambil Mata Kuliah</a></td>
                                                </tr>
                                                <tr>
                                                    <td valign="top" class="body" style="padding-left:12px; padding-right:12px; line-height:16px;"> 
                                                        <a href="#">Bahan Kuliah</a></td>
                                                </tr>
                                                <tr>
                                                    <td valign="top" class="body" style="padding-left:12px; padding-right:12px; line-height:16px;"> 
                                                        <a href="#">Biaya</a></td>
                                                </tr>
                                                <tr>
                                                    <td valign="top" class="body" style="padding-left:12px; padding-right:12px; line-height:16px;"> 
                                                        <a href="#">Departemen</a></td>
                                                </tr>
                                                <tr>
                                                    <td valign="top" class="body" style="padding-left:12px; padding-right:12px; line-height:16px;"> 
                                                        <a href="#">Dosen</a></td>
                                                </tr>
                                                <tr>
                                                    <td valign="top" class="body" style="padding-left:12px; padding-right:12px; line-height:16px;"> 
                                                        <a href="#">Employee</a></td>
                                                </tr>
                                                <tr>
                                                    <td valign="top" class="body" style="padding-left:12px; padding-right:12px; line-height:16px;"> 
                                                        <a href="#">Fakultas</a></td>
                                                </tr>
                                                <tr>
                                                    <td valign="top" class="body" style="padding-left:12px; padding-right:12px; line-height:16px;"> 
                                                        <a href="#">Jadwal</a></td>
                                                </tr>
                                                <tr>
                                                    <td valign="top" class="body" style="padding-left:12px; padding-right:12px; line-height:16px;"> 
                                                        <a href="#">Kurikulum</a></td>
                                                </tr>
                                                <tr>
                                                    <td valign="top" class="body" style="padding-left:12px; padding-right:12px; line-height:16px;"> 
                                                        <a href="#">Mahasiswa</a></td>
                                                </tr>
                                                <tr>
                                                    <td valign="top" class="body" style="padding-left:12px; padding-right:12px; line-height:16px;"> 
                                                        <a href="#">Mata Kuliah</a></td>
                                                </tr>
                                                <tr>
                                                    <td valign="top" class="body" style="padding-left:12px; padding-right:12px; line-height:16px;"> 
                                                        <a href="#">Periodic</a></td>
                                                </tr>
                                                <tr>
                                                    <td valign="top" class="body" style="padding-left:12px; padding-right:12px; line-height:16px;"> 
                                                        <a href="#">Nilai Mahasiswa(IPS)</a></td>
                                                </tr>
                                                <tr>
                                                    <td valign="top" class="body" style="padding-left:12px; padding-right:12px; line-height:16px;"> 
                                                        <a href="#">Ruangan</a></td>
                                                </tr>
                                                <tr>
                                                    <td valign="top" class="body" style="padding-left:12px; padding-right:12px; line-height:16px;"> 
                                                        <a href="#">Semester</a></td>
                                                </tr>
                                                <tr>
                                                    <td valign="top" class="body" style="padding-left:12px; padding-right:12px; line-height:16px;"> 
                                                        <a href="#">Staff</a></td>
                                                </tr>
                                                <tr>
                                                    <td valign="top" class="body" style="padding-left:12px; padding-right:12px; line-height:16px;"> 
                                                        <a href="#">Transaksi</a></td>
                                                </tr>
                                                <tr>
                                                    <td valign="top" class="body" style="padding-left:12px; padding-right:12px; line-height:16px;"> 
                                                        <a href="#">Tugas Kuliah</a></td>
                                                </tr>
                                                <tr>
                                                    <td valign="top" class="body" style="padding-left:12px; padding-right:12px; line-height:16px;"> 
                                                        <a href="#">Ganti Password</a></td>
                                                </tr>
                                                <tr>
                                                    <td valign="top" class="body" style="padding-left:12px; padding-right:12px; line-height:16px;"> 
                                                        <a href="#">Logout</a></td>
                                                </tr>
                                            </table></td>

                                    </tr>
                                </table></td>
                        </tr>
                        <tr>
                            <td valign="top"><table width="744" border="0" cellspacing="0" cellpadding="0">
                                    <tr>
                                        <td width="17" height="67"><img src="images/index_82.gif" width="17" height="67" alt="" /></td>
                                        <td width="707" height="67" bgcolor="#B09074"><pre class="footer"><br /><span class="style1">Copyright © 2013-2014 ithb.ac.id. All Rights Reserved</span></pre>
                                        </td>
                                        <td width="20" height="67" align="right"><img src="images/index_87.gif" width="20" height="67" alt="" /></td>
                                    </tr>
                                </table></td>
                        </tr>
                    </table></td>
            </tr>
        </table>
    </body>
</html>

