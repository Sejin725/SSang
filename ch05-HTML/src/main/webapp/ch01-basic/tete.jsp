<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Calendar</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript">
$(function() {
	  // 달력의 이전 달로 이동하는 함수
	  function previousMonth() {
	    var month = $('#mb_calendar_date').val();
	    var year = month.slice(0, 4);
	    var month = month.slice(5);
	    month--;
	    if (month < 1) {
	      year--;
	      month = 12;
	    }
	    $('#mb_calendar_date').val('${year}-${month}');
	  }

	  // 달력의 다음 달로 이동하는 함수
	  function nextMonth() {
	    var month = $('#mb_calendar_date').val();
	    var year = month.slice(0, 4);
	    var month = month.slice(5);
	    month++;
	    if (month > 12) {
	      year++;
	      month = 1;
	    }
	    $('#mb_calendar_date').val('${year}-${month}');
	  }

	  // 달력의 날짜를 클릭할 때 해당 날짜를 선택하는 함수
	  $('.mb_calendar_date').on("click", function() {
	    var date = $(this).text();
	    $('#mb_calendar_date').val(date);
	  });

	  // 달력의 이전 달 버튼을 클릭할 때 이전 달로 이동하는 함수
	  $('.lnb-prev-month').on("click", previousMonth);

	  // 달력의 다음 달 버튼을 클릭할 때 다음 달로 이동하는 함수
	  $('.lnb-next-month').on("click", nextMonth);

	  // 달력을 tbody에 append
	  var calendar = getCalendar(2023, 6);
	  $('tbody').append(calendar);
	

	function getCalendar(year, month) {
	  var calendar = [];
	  for (var i = 1; i <= daysInMonth(year, month); i++) {
	    var date = '${year}-${month}-${i}';
	    var classList = ["mb_calendar_date"];
	    if (i == today()) {
	      classList.push("today");
	    }
	    calendar.push('<td class="${classList.join(" ")}">${i}</td>');
	  }
	  return calendar.join("");
	}

	function daysInMonth(year, month) {
	  var daysInMonth = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];
	  if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
	    daysInMonth[1] = 29;
	  }
	  return daysInMonth[month - 1];
	}

	function today() {
	  var today = new Date();
	  var year = today.getFullYear();
	  var month = today.getMonth() + 1;
	  var day = today.getDate();
	  return '${year}-${month}-${day}';
	}
});
	</script>
</head>
<body>
	<div class="calendar-box">
		<div class="calendar-lnb">
			<span class="lnb-prev-month"> <a href="#"
				onclick="previousMonth()"> <img
					src="https://demo2.mangboard.com/wp-content/plugins/mangboard/plugins/reservation_template/images/icon_arrow_left.gif">
			</a>
			</span> <span class="calendar-date-text">2023 <span
				class="lnb-year-text">년</span> 06<span class="lnb-month-text">월</span></span>
			<input type="hidden" name="mb_calendar_date" id="mb_calendar_date"
				value="2023-06"> <span class="lnb-next-month"> <a
				href="#" onclick="nextMonth()"> <img
					src="https://demo2.mangboard.com/wp-content/plugins/mangboard/plugins/reservation_template/images/icon_arrow_right.gif">
			</a>
			</span>
		</div>
		<table cellspacing="0" cellpadding="0" border="0"
			class="table table-list">
			<colgroup>
				<col style="width: 15%">
				<col style="width: 14%">
				<col style="width: 14%">
				<col style="width: 14%">
				<col style="width: 14%">
				<col style="width: 14%">
				<col style="width: 15%">
			</colgroup>
			<thead>
				<tr>
					<th class="sunday" scope="col">일</th>
					<th scope="col">월</th>
					<th scope="col">화</th>
					<th scope="col">수</th>
					<th scope="col">목</th>
					<th scope="col">금</th>
					<th class="saturday" scope="col">토</th>
				</tr>
			</thead>
			<tbody>
			</tbody>
		</table>
	</div>
</body>
</html>

