# [level 1] 약수의 개수와 덧셈 - 77884 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/77884) 

### 성능 요약

메모리: 73.3 MB, 시간: 3.89 ms

### 구분

코딩테스트 연습 > 월간 코드 챌린지 시즌2

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2024년 11월 07일 16:04:26

### 문제 설명

<p data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">두 정수 <code data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">left</code>와 <code data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">right</code>가 매개변수로 주어집니다. <code data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">left</code>부터 <code data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">right</code>까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.</p>

<hr data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">

<h5 data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">제한사항</h5>

<ul data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">
<li data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">1 ≤ <code data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">left</code> ≤ <code data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">right</code> ≤ 1,000</li>
</ul>

<hr data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">

<h5 data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">입출력 예</h5>
<table class="table" data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">
        <thead data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09"><tr data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">
<th data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">left</th>
<th data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09" data-immersive-translate-paragraph="1">right<font class="notranslate immersive-translate-target-wrapper" data-immersive-translate-translation-element-mark="1" lang="ko"><font class="notranslate" data-immersive-translate-translation-element-mark="1">&nbsp;</font><font class="notranslate immersive-translate-target-translation-theme-none immersive-translate-target-translation-inline-wrapper-theme-none immersive-translate-target-translation-inline-wrapper" data-immersive-translate-translation-element-mark="1"><font class="notranslate immersive-translate-target-inner immersive-translate-target-translation-theme-none-inner" data-immersive-translate-translation-element-mark="1">오른쪽</font></font></font></th>
<th data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">result</th>
</tr>
</thead>
        <tbody data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09"><tr data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">
<td>13</td>
<td>17</td>
<td>43</td>
</tr>
<tr data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">
<td>24</td>
<td>27</td>
<td>52</td>
</tr>
</tbody>
      </table>
<hr data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">

<h5 data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">입출력 예 설명</h5>

<p data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09"><strong data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">입출력 예 #1</strong></p>

<ul data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">
<li data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">다음 표는 13부터 17까지의 수들의 약수를 모두 나타낸 것입니다.</li>
</ul>
<table class="table" data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">
        <thead data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09"><tr data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">
<th data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">수</th>
<th data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">약수</th>
<th data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">약수의 개수</th>
</tr>
</thead>
        <tbody data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09"><tr data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">
<td>13</td>
<td data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">1, 13</td>
<td>2</td>
</tr>
<tr data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">
<td>14</td>
<td data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">1, 2, 7, 14</td>
<td>4</td>
</tr>
<tr data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">
<td>15</td>
<td data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">1, 3, 5, 15</td>
<td>4</td>
</tr>
<tr data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">
<td>16</td>
<td data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">1, 2, 4, 8, 16</td>
<td>5</td>
</tr>
<tr data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">
<td>17</td>
<td data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">1, 17</td>
<td>2</td>
</tr>
</tbody>
      </table>
<ul data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">
<li data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">따라서, 13 + 14 + 15 - 16 + 17 = 43을 return 해야 합니다.</li>
</ul>

<p data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09"><strong data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">입출력 예 #2</strong></p>

<ul data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">
<li data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">다음 표는 24부터 27까지의 수들의 약수를 모두 나타낸 것입니다.</li>
</ul>
<table class="table" data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">
        <thead data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09"><tr data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">
<th data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">수</th>
<th data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">약수</th>
<th data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">약수의 개수</th>
</tr>
</thead>
        <tbody data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09"><tr data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">
<td>24</td>
<td data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">1, 2, 3, 4, 6, 8, 12, 24</td>
<td>8</td>
</tr>
<tr data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">
<td>25</td>
<td data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">1, 5, 25</td>
<td>3</td>
</tr>
<tr data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">
<td>26</td>
<td data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">1, 2, 13, 26</td>
<td>4</td>
</tr>
<tr data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">
<td>27</td>
<td data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">1, 3, 9, 27</td>
<td>4</td>
</tr>
</tbody>
      </table>
<ul data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">
<li data-immersive-translate-walked="e4c1c1e5-91ac-40b1-9613-3c4979831d09">따라서, 24 - 25 + 26 + 27 = 52를 return 해야 합니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges